package com.lanshiqin.apiboot.core.repository;

import com.lanshiqin.apiboot.core.entity.SysUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserInfoRepository extends JpaRepository<SysUserInfo,String> {

}
