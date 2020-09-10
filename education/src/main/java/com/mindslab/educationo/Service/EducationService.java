package com.mindslab.educationo.Service;

import com.mindslab.educationo.dto.EducationDto;
import com.mindslab.educationo.dto.TestDto;
import com.mindslab.educationo.dto.WebDto;
import com.mindslab.educationo.dto.repository.mapper.TestMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import java.util.*;

@Service
public class EducationService {

    final
    TestMapper mapper;
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    public EducationService(TestMapper mapper)
    {
        this.mapper = mapper;
    }

    public String doTest()
    {
        String text = "Education Test Done";
        return text;
    }

    public String getTest()
    {
        return "getTest";
    }

//    public void insertPost(EducationDto dto)
//    {
//        mapper.editTestTable(dto.getInteger(),dto.getString());
//        return;
////        private String string;
////        private int Integer;
////        private boolean bool;
////        private double number1;
////        private char char1;
////        private float number2;
////        private int num1;
////        private int num2;
////        mapper.editTestTable(dto.getInteger(),dto.getString());
////        logger.info(dto.getInteger() + " UPDATED and INSERTED");
//    }

    public int add(WebDto dto)
    {
        return 0;
//        return dto.getNum1() + dto.getNum2();
    }

    public void create(WebDto dto)
    {
        mapper.insertTestTable(dto.getName(),dto.getInformation());
    }

//    public List<WebDto> getInfo()
//    {
//        List<WebDto> list = new List<WebDto>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<WebDto> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(WebDto webDto) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends WebDto> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends WebDto> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                return false;
//            }
//
//            @Override
//            public int hashCode() {
//                return 0;
//            }
//
//            @Override
//            public WebDto get(int index) {
//                return null;
//            }
//
//            @Override
//            public WebDto set(int index, WebDto element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, WebDto element) {
//
//            }
//
//            @Override
//            public WebDto remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<WebDto> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<WebDto> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<WebDto> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        };
//        for(int x=0; )
//
//        return [];
//    }


    public List<WebDto> selectTest()
    {
        List<WebDto> list = new ArrayList<WebDto>();
        for(int x=0; x<mapper.selectTestTable().size(); x++)
        {
            WebDto dto = mapper.selectTestTable().get(x);
            list.add(dto);
        }

//        WebDto dto = mapper.selectTestTable().get(0);
//        logger.info(dto.toString());
        logger.info(list.toString());
        return list;
    }
    public void deleteTest(int id)
    {
        int dto = mapper.deleteTestTable(id);
//        logger.info("DELETE ID: "); //put id info here
//        return;
    }

    public void editTest(int id, String name, String info)
    {
        mapper.editTestTable(id,name,info);
//        logger.info("EDITED ID: "); //put id info here
//        return;
    }

    public void visitTest(int id)
    {
        mapper.visitTestTable(id);
//        logger.info("EDITED ID: "); //put id info here
//        return;
    }


}
