package com.prueba.tecnica.inditex.atsistemas.api.dto;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductsDTO {

    private Integer brandId;
    private String startDate;
    private String endDate;
    private Integer priceList;
    public Integer productId;
    private BigDecimal price;
}
