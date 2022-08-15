package com.peggy.assers.mapper.user;

import com.peggy.assers.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    void addUser(User user);
    void delUser(Integer id);
    void upUser(User user);
    List<User> queryUser();
    String queryUserAdmin(String admin);

}
