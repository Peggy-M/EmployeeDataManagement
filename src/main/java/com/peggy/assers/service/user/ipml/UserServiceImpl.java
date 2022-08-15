package com.peggy.assers.service.user.ipml;

import com.peggy.assers.mapper.user.UserMapper;
import com.peggy.assers.pojo.User;
import com.peggy.assers.service.user.UserServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserServce {

    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
        userMapper.delUser(id);
    }

    @Override
    public void upUser(User user) {
        userMapper.upUser(user);
    }

    @Override
    public List<User> queryUser() {
       return userMapper.queryUser();
    }

    @Override
    public String queryUserAdmin(String admin) {
        return userMapper.queryUserAdmin(admin);
    }
}
