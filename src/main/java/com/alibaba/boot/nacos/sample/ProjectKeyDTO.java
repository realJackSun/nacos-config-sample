package com.alibaba.boot.nacos.sample;


import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@NacosConfigurationProperties(dataId = "project-key", groupId = "DEVELOP", autoRefreshed = true, type = ConfigType.JSON)
public class ProjectKeyDTO {
    private Integer courseType;
    private String courseTypeName;
    private String key;
    private Integer resourceProjectId;
}
