package com.mindslab.educationo.dto;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class WebDto {

    public WebDto(String name, String information) {
        this.name = name;
        this.information = information;
    }

    private int id;
    private String name;
    private String information;
    private Date time;
    private int visit;
}
