# SpringBoot的Web单体CRUD应用

## 界面展示

![image-20220815143726381](https://img-blog.csdnimg.cn/img_convert/db0aaac0629341eca92a4a6194e01b1b.png)

![image-20220815143810096](https://img-blog.csdnimg.cn/img_convert/7d8532ddac3f7509e3d3f83e939c0b72.png)

![image-20220815143832292](https://img-blog.csdnimg.cn/img_convert/0378ba735983df7c5522fc6c4d353562.png)



![image-20220815143847937](https://img-blog.csdnimg.cn/img_convert/5bb9aeaea3cb2957eb748df368c29fd7.png)

![image-20220815143905308](https://img-blog.csdnimg.cn/img_convert/5afa6c0e49c4197e64b30f0eb6cf115e.png)

## 基本功能：

- 非法登录拦截
- 登录用户校验
- 员工管理模块的单体应用数据CRUD功能实现
- 用户数据注销退出

## 数据库sql代码

### 后台数据库构建表


- user 用户登录管理表

```mysql
-- auto-generated definition
create table user
(
    id       int auto_increment
        primary key,
    user_id  int         not null,
    admin    varchar(50) null,
    password varchar(50) null,
    email    varchar(50) null,
    constraint user_user_id_uindex
        unique (user_id)
);
```


- department 部门表

```mysql
-- auto-generated definition
create table department
(
    id              int(3) auto_increment comment '部门id'
        primary key,
    department_name varchar(20) not null comment '部门名字'
);
```

- employee 员工表

```mysql
-- auto-generated definition
create table employee
(
    id         int(5) auto_increment comment '雇员id'
        primary key,
    last_name  varchar(100) not null comment '名字',
    email      varchar(100) not null comment '邮箱',
    gender     int(2)       not null comment '性别1 男, 0 女',
    department int(3)       not null comment '部门id',
    birth      datetime     not null comment '生日'
);
```

## 目录结构说明：

![image-20220815144959182](https://img-blog.csdnimg.cn/img_convert/76db3745be6c6b4cf5f18cd23a12a090.png) 



## 

E:.
│  AssersApplication.java
│
├─config 		**控制层**
├─control
│  ├─data
│  │      DepartmentControl.java 	 	部门数据控制
│  │      EmployeeControl.java 		员工数据控制
│  │      UserControl.java 			用户数据控制
│  │
│  └─dispose
│          DashboardControl.java    非法访问拦截
│          IndexControl.java   初始化登录界面页面加载
│          LoginControl.java  登录验证
│
├─mapper 		**mappper层**
│  ├─department
│  │      DepartmentMapper.java  部门数据处理接口
│  │      DepartmentMapper.xml  部门数据处理映射文件
│  │
│  ├─employee
│  │      EmployeeMapper.java   员工数据处理接口
│  │      EmployeeMapper.xml  员工数据处理映射文件
│  │
│  └─user
│          UserMapper.java  用户数据处理接口
│          UserMapper.xml 用户数据处理映射文件
│
├─pojo 		**实体类**
│      Department.java	 部门实体类
│      Employee.java 员工实体类
│      User.java 用户实体类
│
└─service 	 **服务层**
    ├─department
    │  │  DepartmentService.java  部门数据控制服务接口
    │  │
    │  └─impll
    │          DepartmentServiceImpl.java  部门数据控制实现
    │
    ├─employee
    │  │  EmployeeService.java  员工数据控制服务接口
    │  │
    │  └─impl
    │          EmployeeServiceImpl.java  员工数据控制服务实现
    │
    └─user
        │  UserServce.java  用户数据控制服务接口
        │
        └─ipml
                UserServiceImpl.java 用户数据控制服务实现

​						

由于只完成了一部分的功能模块哈。

自己会的东西比较少哈，所以只完成了员工管理模块与登录数据拦截校验，目前测试没有问题，其他的模块需要用到其他的技术。

不要问未什么没做，咳咳咳，，问就是我们没友谊赖，就是就是我不会。。。。赖。。

整个项目只完成了一个增删改查，内部的代码，所以功能比较简单，后续滴完善就..就...就。。。就交给你们赖。

额。。。如果，我说如果哈，有人问，举手，，，亲我也想有一个这样酷酷哒私人网页界面，哈哈 你问对人赖。如果你没有问，那不行，那我也要告诉你，不要问原因。

目前测试，基本功能没有问题。
整个工程源码都推送到了GitHub中，直接使用IDEA拉取即可。至于后台的数据库，复制上述中的sql片段语句，执行构建即可啦。没错就是这么简单，快去玩吧。。铛~铛~铛~.......



如果GitHub访问太慢哈，那那就，咳~咳~咳，站在梯子上哈，看看墙外的世界----》

![image-20220815152904787](https://img-blog.csdnimg.cn/img_convert/5826779e32ff6bc91e736a507eb73d4e.png) 

**<font color='cornflowerblue'>Clash代理url地址（上高速不迷路）:</font>**   https://99ding.men/api/v1/client/subscribe?token=626093e8e93b996a54c8462505a5aa1e

![image-20220815152709273](https://img-blog.csdnimg.cn/img_convert/18a92efd6f02eb82590937e2062586fd.png) 

> **<font color='orange'>哦 还有一件事，亲们我滴梯子流量不多，不要用来刷视频哈！！！<<<<<<<亲、不要用来干坏事哦！</font>**

**<font color='cornflowerblue'>github: 项目源码地址：</font>**  https://github.com/Peggy-M/EmployeeDataManagement.git

