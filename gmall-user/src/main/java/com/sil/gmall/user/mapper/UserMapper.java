package com.sil.gmall.user.mapper;

import com.sil.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    /**
     * 获取所有用户
     * */
    List<UmsMember> getAllUser();
}
