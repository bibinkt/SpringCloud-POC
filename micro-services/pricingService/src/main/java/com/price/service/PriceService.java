package com.price.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.price.model.Price;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PriceService {


    @RequestMapping("/price")
    public Price getPrice(
            @RequestParam(value = "productId",  required = true) int productId) {

        	return new Price(productId,20.0,30.0);
    }

 }
