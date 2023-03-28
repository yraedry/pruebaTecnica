package com.prueba.tecnica.inditex.atsistemas.service.publish;

import com.prueba.tecnica.inditex.atsistemas.domain.entity.Products;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public interface ProductsService {

    List<Products> getProducts(Integer idProduct, Integer brandId, LocalDateTime date);

}
