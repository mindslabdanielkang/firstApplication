package com.mindslab.educationo.Controller;

import com.mindslab.educationo.Service.EducationService;
import com.mindslab.educationo.dto.EducationDto;
import com.mindslab.educationo.dto.IdDto;
import com.mindslab.educationo.dto.WebDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
@RequestMapping
public class EducationController {

    final EducationService service;
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    public EducationController(EducationService service) { this.service = service; }

    @RequestMapping("/test")
    @ResponseBody
    public String educationTest(HttpServletRequest request)
    {
        logger.info("TEST CLICKED");
        return service.doTest(); //type alt Enter (When Function is not initialized)
    }

//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity getMethod()
//    {
//        logger.info("GET PRESSED");
//        return new ResponseEntity(HttpStatus.OK);
//    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<WebDto> getMethod()
    {
        return service.selectTest();
//        return new WebDto("daniel","information here");

    }


    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity postMethod(@RequestBody WebDto dto)
    {
        logger.info("POST PRESSED");
        service.create(dto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/visit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity visitIncrease(@RequestBody IdDto dto)
    {
        logger.info("VISIT PRESSED");
        service.visitTest(dto.getId());
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/page")
    public String educationPage() {
            return "test";
    }

    @RequestMapping("/add")
    public ResponseEntity addMethod(@RequestBody WebDto dto)
    {
        logger.info(dto.toString());
        service.create(dto);
        return new ResponseEntity(HttpStatus.OK);
//            return new ResponseEntity(HTTPStatus.OK);
    }

//    @RequestMapping("/testing")
//    public JsonObject returnJson()
//    {
//        return new JsonObject("Daniel");
//    }

    @RequestMapping("/select")
    private ResponseEntity selectTestTable()
    {
        service.selectTest();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/delete")
    @ResponseBody
    private ResponseEntity deleteTestTable(@RequestBody IdDto dto)
    {
        logger.info("DELETE EXECUTED");
        service.deleteTest(dto.getId());
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/update")
    @ResponseBody
    private ResponseEntity updateTestTable(@RequestBody WebDto dto)
    {
        logger.info("UPDATE EXECUTED");
        service.editTest(dto.getId(),dto.getName(),dto.getInformation());
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/edit")
    private ResponseEntity editTestTable()
    {
//        service.editTest();
        return new ResponseEntity(HttpStatus.OK);
    }
}