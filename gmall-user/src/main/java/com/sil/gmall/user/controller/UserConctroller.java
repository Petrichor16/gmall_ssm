package com.sil.gmall.user.controller;

import com.sil.gmall.user.bean.UmsMember;
import com.sil.gmall.user.bean.UmsMemberReceiveAddress;
import com.sil.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserConctroller {

    @Autowired
    UserService userService;


    /**
     * 搜索全部用户
     * */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    /**
     * 搜索全部用户
     * */
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> memberList = userService.getAllUser();
        return memberList;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello world!";
    }

}
