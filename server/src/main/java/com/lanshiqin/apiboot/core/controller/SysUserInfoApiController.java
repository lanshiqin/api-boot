package com.lanshiqin.apiboot.core.controller;

import com.lanshiqin.apiboot.core.bean.JsonDataBean;
import com.lanshiqin.apiboot.core.entity.SysUserInfo;
import com.lanshiqin.apiboot.core.repository.SysUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息维护控制器
 */
@RestController
@RequestMapping("api")
public class SysUserInfoApiController extends JsonBaseController {

    private SysUserInfoRepository sysUserInfoRepository;

    @Autowired
    public SysUserInfoApiController(SysUserInfoRepository sysUserInfoRepository) {
        this.sysUserInfoRepository = sysUserInfoRepository;
    }

    /**
     * 添加用户信息
     * @param sysUserInfo
     * @return
     */
    @PostMapping(value = "/userinfo")
    public JsonDataBean add(@RequestBody SysUserInfo sysUserInfo){
        try{
            sysUserInfoRepository.save(sysUserInfo);
            return getJsonDataBean("200","保存成功");
        }catch (Exception e){
            return getJsonDataBean("500","保存失败");
        }

    }

    /**
     * 获取所有用户信息列表
     * @return 所有用户信息列表
     */
    @GetMapping("/userinfo/list")
    public JsonDataBean list(){
        return getJsonDataBean("200","用户信息列表",sysUserInfoRepository.findAll());
    }

    /**
     * 获取指定id的用户信息
     * @param id 用户信息id
     * @return 用户信息
     */
    @GetMapping("/userinfo/{id}")
    public JsonDataBean findById(@PathVariable String id){
        return getJsonDataBean("200","用户信息",sysUserInfoRepository.findById(id));
    }

    /**
     * 删除指定id的用户信息
     * @param id 用户信息id
     * @return 删除状态
     */
    @DeleteMapping("/userinfo/{id}")
    public JsonDataBean delete(@PathVariable String id){
        sysUserInfoRepository.deleteById(id);
        return getJsonDataBean("200","删除成功");
    }
}
