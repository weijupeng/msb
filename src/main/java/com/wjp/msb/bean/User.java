package com.wjp.msb.bean;

import lombok.Data;

/**
 * @author wjp
 * @date 2020/5/6 14:10
 */
@Data

public class User {
    private Long id;
    private String name;
    private String password;
    private String description;

}
