package com.xx.gmall.service.impl;


import com.xx.gmall.bean.UmsMember;
import com.xx.gmall.mapper.UserMapper;
import com.xx.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        //List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }



}
