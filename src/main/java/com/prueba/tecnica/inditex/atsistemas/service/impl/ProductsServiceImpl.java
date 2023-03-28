package com.prueba.tecnica.inditex.atsistemas.service.impl;

import com.prueba.tecnica.inditex.atsistemas.domain.entity.Products;
import com.prueba.tecnica.inditex.atsistemas.domain.repository.ProductsRepository;
import com.prueba.tecnica.inditex.atsistemas.service.publish.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    public ProductsServiceImpl() {}

    @Autowired
    ProductsRepository repo;


    @Override
    public List<Products> getProducts(Integer idProduct, Integer brandId, LocalDateTime date) {
        return repo.findProduct(idProduct, brandId, date);
    }


}
