package com.peggy.assers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private Integer user_id;
    private String admin;
    private String password;
    private String email;

    public User(Integer user_id, String admin, String password, String email) {
        this.user_id = user_id;
        this.admin = admin;
        this.password = password;
        this.email = email;
    }
}
