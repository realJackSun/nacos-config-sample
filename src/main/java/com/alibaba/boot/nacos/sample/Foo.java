/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.boot.nacos.sample;

import com.alibaba.nacos.api.common.Constants;
import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.stereotype.Component;


/*
 ** 容易导致NacosConfigurationPropertie传递失败的原因：
 *  1、dataId不对
 *  2、groupId不对
 *  3、type不对（这个特别坑，如果你在Nacos侧配置的是一个properties文件，但是这里设置了ConfigType.JSON，就容易导致获取不到配置；而且还没有任何报错提示）
 */
@Component
@NacosConfigurationProperties(prefix = "", dataId = "people", groupId = "DEFAULT_GROUP", autoRefreshed = true, type = ConfigType.PROPERTIES)
public class Foo {

	private String dept;

	private String group;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Foo{" + "dept='" + dept + '\'' + ", group='" + group + '\'' + '}';
	}
}
