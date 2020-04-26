package com.sil.gmall.user.service;

import com.sil.gmall.user.bean.UmsMember;
import com.sil.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**
     * 获取全部用户
     * */
    List<UmsMember> getAllUser();

    /**
     * 根据用户ID获取用户收货地址*/
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
