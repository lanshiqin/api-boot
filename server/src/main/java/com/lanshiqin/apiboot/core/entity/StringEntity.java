package com.lanshiqin.apiboot.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
@Data
@EqualsAndHashCode(callSuper = false)
public class StringEntity extends BaseEntity {
    @Id
    protected String sysId;   // 主键

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
}
