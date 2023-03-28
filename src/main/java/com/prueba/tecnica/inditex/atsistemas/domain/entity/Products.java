package com.prueba.tecnica.inditex.atsistemas.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @JoinColumn(name = "BrandId")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Integer BrandId;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "priceList")
    private Integer priceList;

    @Column(name = "productId")
    public Integer productId;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price", precision = 4, scale = 2)
    private BigDecimal price;

    @Column(name = "curr")
    private String curr;

    public Products(Integer productId, Integer brandId, Integer priceList, LocalDateTime startDate, LocalDateTime endDate, BigDecimal price) {
        super();
        this.productId=productId;
        this.BrandId=brandId;
        this.priceList=priceList;
        this.startDate=startDate;
        this.endDate=endDate;
        this.price=price;
    }
}
