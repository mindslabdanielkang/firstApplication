package com.mindslab.educationo.dto.repository.mapper;

import com.mindslab.educationo.dto.TestDto;
import com.mindslab.educationo.dto.WebDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    int insertTestTable(@Param("name") String name, @Param("info") String info);
    List<WebDto> selectTestTable();
    int deleteTestTable(@Param("id") int id);
    void editTestTable(@Param("id")int id, @Param("name")String name, @Param("info")String information);

    void visitTestTable(@Param("id")int id);
}
