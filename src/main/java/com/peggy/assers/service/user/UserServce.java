package com.peggy.assers.service.user;

import com.peggy.assers.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServce {
    void addUser(User user);
    void delUser(Integer id);
    void upUser(User user);
    List<User> queryUser();
    String queryUserAdmin(String admin);
}
