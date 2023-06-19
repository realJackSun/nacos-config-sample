package com.alibaba.boot.nacos.sample;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NacosConfigurationProperties(dataId = "project-key", groupId = "DEVELOP",
        autoRefreshed = false, type = ConfigType.JSON)
public class ProjectKeyConfig {

    private List<ProjectKeyDTO> list;
}
