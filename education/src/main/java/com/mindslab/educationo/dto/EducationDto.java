package com.mindslab.educationo.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;

@Data
@ToString
public class EducationDto {

    public EducationDto(String string, int integer) {
        this.string = string;
        Integer = integer;
    }

    private String string;
    private int Integer;
    private boolean bool;
    private double number1;
    private char char1;
    private float number2;
    private int num1;
    private int num2;



}
