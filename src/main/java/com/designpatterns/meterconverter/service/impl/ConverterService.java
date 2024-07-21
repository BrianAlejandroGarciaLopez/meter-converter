package com.designpatterns.meterconverter.service.impl;

import com.designpatterns.meterconverter.service.IConverterService;
import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService {

    @Override
    public Double convertToCentimeters(Double meters) {
        return meters*100;
    }
}
