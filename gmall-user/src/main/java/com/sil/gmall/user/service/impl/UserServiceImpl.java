package com.sil.gmall.user.service.impl;

import com.sil.gmall.user.bean.UmsMember;
import com.sil.gmall.user.bean.UmsMemberReceiveAddress;
import com.sil.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.sil.gmall.user.mapper.UserMapper;
import com.sil.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper addressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //List<UmsMember> memberList = userMapper.getAllUser();
        List<UmsMember> memberList = userMapper.getAllUser();
        return memberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
       /* Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", Integer.parseInt(memberId));
        List<UmsMemberReceiveAddress> addressList = addressMapper.selectByExample(e);*/

        UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
        address.setMemberId(Long.parseLong(memberId));
        List<UmsMemberReceiveAddress> addressList = addressMapper.select(address);
        return addressList;
    }
}
