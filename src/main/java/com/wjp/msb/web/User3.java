package com.wjp.msb.web;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @author wjp
 * @date 2020/5/25 16:57
 */
@Data
public class User3 {
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "年龄")
    private Integer age;
    private String desc;
    private Integer size;
    private Integer lengths;
}
