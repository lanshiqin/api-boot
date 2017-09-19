package com.lanshiqin.apiboot.core.entity;

import org.springframework.data.annotation.Id;

public class StringEntity extends BaseEntity {
    @Id
    protected String sysId;   // 主键
}
