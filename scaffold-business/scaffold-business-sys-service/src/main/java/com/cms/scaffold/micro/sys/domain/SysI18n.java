package com.cms.scaffold.micro.sys.domain;

import com.cms.scaffold.common.annotation.TableName;
import com.cms.scaffold.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*
* @author: Mybatis Generator
* @date: 2019-08-01 19:28:54
*/
@Getter
@Setter
@ToString
@TableName(name = "sys_i18n")
public class SysI18n extends BaseEntity {
    /** 模块**/
    private String model;

    /** 名称**/
    private String name;

    /** 内容**/
    private String text;

    /** 中文内容**/
    private String zhCn;

    /** 英文内容**/
    private String enUs;
}
