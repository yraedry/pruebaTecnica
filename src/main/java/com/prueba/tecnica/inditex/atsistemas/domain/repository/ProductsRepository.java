package com.prueba.tecnica.inditex.atsistemas.domain.repository;

import com.prueba.tecnica.inditex.atsistemas.domain.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository <Products, String> {

    @Query(value="SELECT * FROM PRODUCTS WHERE PRODUCT_ID=?1 AND BRAND_ID =?2", nativeQuery = true)
    List<Products> findProduct(Integer idProduct, Integer BrandID, LocalDateTime startDate);
}
