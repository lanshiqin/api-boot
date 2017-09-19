package com.lanshiqin.apiboot.core.controller;

import com.lanshiqin.apiboot.core.entity.SysUserInfo;
import com.lanshiqin.apiboot.core.repository.SysUserInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SysUserInfoApiController {

    private SysUserInfoRepository sysUserInfoRepository;

    @Autowired
    public SysUserInfoApiController(SysUserInfoRepository sysUserInfoRepository) {
        this.sysUserInfoRepository = sysUserInfoRepository;
    }


    @PostMapping("/userinfo")
    public void add(@RequestBody List<SysUserInfo> sysUserInfoPublisher){
        sysUserInfoRepository.insert(sysUserInfoPublisher);
    }

    @GetMapping("/userinfo/list")
    public List<SysUserInfo> list(){
        return sysUserInfoRepository.findAll();
    }
}
