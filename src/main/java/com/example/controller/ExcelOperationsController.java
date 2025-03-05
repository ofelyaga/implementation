package com.example.controller;

import com.example.service.ExcelOperationsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcelOperationsController {
    public ExcelOperationsService excelOperationsService;

    public ExcelOperationsController(ExcelOperationsService excelOperationsService){
        this.excelOperationsService = excelOperationsService;
    }
    @RequestMapping(value = "/greeting")
    public String greeting(){
        return "greet";
    }
}
