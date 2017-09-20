package com.lanshiqin.apiboot.core.entity;

import lombok.Data;

/**
 * 实体基类
 */
@Data
public class BaseEntity {
    protected String createDate;  // 创建日期
    protected String createTime;  // 创建时间
    protected String createUser;  // 创建用户
    protected String updateDate;  // 更新日期
    protected String updateTime;  // 更新时间
    protected String updateUser;  // 更新用户
}
