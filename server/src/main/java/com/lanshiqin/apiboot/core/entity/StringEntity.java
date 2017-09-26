package com.lanshiqin.apiboot.core.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class StringEntity extends BaseEntity {
    @Id
    @NotNull
    @Column(length = 20)
    private String sysId;   // 主键

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
}
