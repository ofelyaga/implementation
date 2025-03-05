package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelOperationsService {
    private String text;
    @Autowired
    public ExcelOperationsService(String text){
        this.text = text;
    }
}
