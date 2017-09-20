package com.lanshiqin.apiboot.core.repository;

import com.lanshiqin.apiboot.core.entity.SysUserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SysUserInfoRepository extends MongoRepository<SysUserInfo,String> {

}
