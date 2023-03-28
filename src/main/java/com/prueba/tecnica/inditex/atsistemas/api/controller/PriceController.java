package com.prueba.tecnica.inditex.atsistemas.api.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.prueba.tecnica.inditex.atsistemas.domain.entity.Products;
import com.prueba.tecnica.inditex.atsistemas.service.impl.ProductsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("producto")
public class PriceController {
    @Autowired
    ProductsServiceImpl service;

    @GetMapping("/{product_id}/{brand_id}/{period_date}")
    @ResponseStatus(HttpStatus.OK)
    public List<Products> getProductById(
            @PathVariable Integer product_id,
            @PathVariable Integer brand_id,
            @PathVariable (value="period_date")
            @DateTimeFormat(pattern="yyyy-MM-dd'T'HH.mm.ss") LocalDateTime period_date) {
        LOGGER.info("*** Recuperando ID:: " + product_id);
        LOGGER.info("*** Recuperando brandId:: " + brand_id);
        LOGGER.info("*** Recuperando date:: " + period_date);

        return service.getProducts(product_id, brand_id, period_date);
    }
}
