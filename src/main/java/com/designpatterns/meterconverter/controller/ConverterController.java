package com.designpatterns.meterconverter.controller;

import com.designpatterns.meterconverter.service.impl.ConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {
    private final ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @GetMapping("/meters/{meters}")
    private Double convertToCentimeters(@PathVariable Double meters){
        return converterService.convertToCentimeters(meters);
    }
}
