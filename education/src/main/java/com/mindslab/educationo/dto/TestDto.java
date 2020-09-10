package com.mindslab.educationo.dto;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class TestDto {
    private int ID;
    private String name;
    private int age;
    private Date time;
}
