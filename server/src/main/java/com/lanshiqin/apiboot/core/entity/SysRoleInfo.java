package com.lanshiqin.apiboot.core.entity;

/**
 * 角色信息实体类
 */
public class SysRoleInfo extends StringEntity {
    private String name;    // 角色名称
    private String type;    // 角色类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
