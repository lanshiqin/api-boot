package com.lanshiqin.apiboot.core.controller;

import com.lanshiqin.apiboot.core.bean.JsonDataBean;
import com.lanshiqin.apiboot.core.entity.SysUserInfo;
import com.lanshiqin.apiboot.core.repository.SysUserInfoRepository;
import com.mongodb.MongoWriteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息维护控制器
 */
@RestController
@RequestMapping("api")
public class SysUserInfoApiController extends JsonBaseController {

    private SysUserInfoRepository sysUserInfoRepository;

    private MongoTemplate mongodbTemplate;

    @Autowired
    public SysUserInfoApiController(SysUserInfoRepository sysUserInfoRepository, MongoTemplate mongodbTemplate) {
        this.sysUserInfoRepository = sysUserInfoRepository;
        this.mongodbTemplate = mongodbTemplate;
    }

    /**
     * 添加用户信息
     * @param sysUserInfo
     * @return
     */
    @PostMapping(value = "/userinfo")
    public JsonDataBean add(@RequestBody SysUserInfo sysUserInfo){
        try{
            sysUserInfoRepository.insert(sysUserInfo);
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
        long count = mongodbTemplate.remove(new Query(Criteria.where("sysId").is(id)),SysUserInfo.class).getDeletedCount();
        if (count>0){
            return getJsonDataBean("200","删除成功");
        }
        return getJsonDataBean("500","删除的记录不存在");
    }
}
