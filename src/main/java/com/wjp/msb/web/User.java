package com.wjp.msb.web;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @author wjp
 * @date 2020/5/11 15:53
 */
@Data
public class User {
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "年龄")
    private Integer age;
}
