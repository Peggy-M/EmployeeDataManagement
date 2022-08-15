package com.peggy.assers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
  private  Integer  id;
  private  String   last_name;
  private  String   email;
  private  Integer  gender;
  private  Integer  department;
  private  String   birth;
  private  Department data_department;

  public Employee(String last_name, String email, Integer gender, Integer department, String birth) {
    this.last_name = last_name;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = birth;
  }

  public Employee(Integer id, String last_name, String email, Integer gender, Integer department, String birth) {
    this.id = id;
    this.last_name = last_name;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = birth;
  }
}
