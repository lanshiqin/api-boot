package com.lanshiqin.apiboot.core.entity;

import javax.persistence.*;


@Entity
@Table(name = "sys_user_info")
public class SysUserInfo extends StringEntity {
    private String nick;        // 昵称
    private String sex;         // 性别
    private String birthday;    // 生日

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
