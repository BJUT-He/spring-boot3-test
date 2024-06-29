package com.atguigu.boot3.ssm.bean;

import lombok.Data;

@Data
public class TUser {

    private Long id;
    private String loginName;
    private String nickName;
    private String passwd;

}
