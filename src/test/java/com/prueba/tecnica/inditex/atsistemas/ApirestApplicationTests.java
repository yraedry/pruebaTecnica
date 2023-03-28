package com.prueba.tecnica.inditex.atsistemas;

import com.prueba.tecnica.inditex.atsistemas.api.controller.PriceController;
import com.prueba.tecnica.inditex.atsistemas.domain.entity.Products;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static com.prueba.tecnica.inditex.atsistemas.config.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ApirestApplicationTests {

	@Autowired
	PriceController priceController;

	@DisplayName("Test peticion a las 10:00 del dia 14 del producto 35455")
	@Test
	@Order(1)
	void testCase1() throws Exception {
		//given
		//when
		LocalDateTime TEST_DATE = LocalDateTime.parse("2020-06-14T10:00:00");
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime periodDate = LocalDateTime.parse(TEST_DATE.format(dateTimeFormatter));
		List<Products>  products = priceController.getProductById(TEST_PRODUCT_ID, TEST_BRAND_ID, periodDate);
		Products productFinal;

		LocalDateTime startDate;
		LocalDateTime endDate;
		//then
		boolean checkDate;
		if(products != null) {
			for (Products product : products) {
				startDate = product.getStartDate();
				endDate = product.getEndDate();
				checkDate = periodDate.isAfter(startDate) && periodDate.isBefore(endDate);
				LOGGER.info("rango de fecha::  fecha de inicio --> " + startDate + " fecha de inicio --> " + endDate);
				productFinal = Products.builder()
						.id(product.getId())
						.productId(product.getProductId())
						.BrandId(product.getBrandId())
						.priceList(product.getPriceList())
						.startDate(product.getStartDate())
						.endDate(product.getEndDate())
						.price(product.getPrice())
						.build();

				if (checkDate) {
					LOGGER.info(TEST_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertTrue(checkDate, "obtenemos el pricelist");
				} else {
					LOGGER.info(TEST_NOT_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertFalse(checkDate, "el price list obtenido no es valido");

				}
			}
		}
	}

	@DisplayName("Test peticion a las 16:00 del dia 14 del producto 35455")
	@Test
	@Order(2)
	void testCase2() {
		//given
		//when
		LocalDateTime TEST_DATE = LocalDateTime.parse("2020-06-14T16:00:00");
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime periodDate = LocalDateTime.parse(TEST_DATE.format(dateTimeFormatter));
		List<Products>  products = priceController.getProductById(TEST_PRODUCT_ID, TEST_BRAND_ID, periodDate);
		Products productFinal;
		LocalDateTime startDate;
		LocalDateTime endDate;
		//then
		boolean checkDate;
		if(products != null) {
			for (Products product : products) {
				startDate = product.getStartDate();
				endDate = product.getEndDate();
				checkDate = periodDate.isAfter(startDate) && periodDate.isBefore(endDate);
				LOGGER.info("rango de fecha::  fecha de inicio --> " + startDate + " fecha de inicio --> " + endDate);
				productFinal = Products.builder()
						.id(product.getId())
						.productId(product.getProductId())
						.BrandId(product.getBrandId())
						.priceList(product.getPriceList())
						.startDate(product.getStartDate())
						.endDate(product.getEndDate())
						.price(product.getPrice())
						.build();

				if (checkDate) {
					LOGGER.info(TEST_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertTrue(checkDate, "obtenemos el pricelist");
				} else {
					LOGGER.info(TEST_NOT_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertFalse(checkDate, "el price list obtenido no es valido");

				}
			}
		}
	}

	@DisplayName("Test peticion a las 21:00 del dia 14 del producto 35455")
	@Test
	@Order(3)
	void testCase3() {
		//given
		//when
		LocalDateTime TEST_DATE = LocalDateTime.parse("2020-06-14T21:00:00");
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime periodDate = LocalDateTime.parse(TEST_DATE.format(dateTimeFormatter));
		List<Products>  products = priceController.getProductById(TEST_PRODUCT_ID, TEST_BRAND_ID, periodDate);
		Products productFinal;
		LocalDateTime startDate;
		LocalDateTime endDate;
		//then
		boolean checkDate;
		if(products != null) {
			for (Products product : products) {
				startDate = product.getStartDate();
				endDate = product.getEndDate();
				checkDate = periodDate.isAfter(startDate) && periodDate.isBefore(endDate);
				LOGGER.info("rango de fecha::  fecha de inicio --> " + startDate + " fecha de inicio --> " + endDate);
				productFinal = Products.builder()
						.id(product.getId())
						.productId(product.getProductId())
						.BrandId(product.getBrandId())
						.priceList(product.getPriceList())
						.startDate(product.getStartDate())
						.endDate(product.getEndDate())
						.price(product.getPrice())
						.build();

				if (checkDate) {
					LOGGER.info(TEST_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertTrue(checkDate, "obtenemos el pricelist");
				} else {
					LOGGER.info(TEST_NOT_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertFalse(checkDate, "el price list obtenido no es valido");

				}
			}
		}
	}

	@DisplayName("Test peticion a las 10:00 del dia 15 del producto 35455")
	@Test
	@Order(4)
	void testCase4() {
		//given
		//when
		LocalDateTime TEST_DATE = LocalDateTime.parse("2020-06-15T10:00:00");
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime periodDate = LocalDateTime.parse(TEST_DATE.format(dateTimeFormatter));
		List<Products>  products = priceController.getProductById(TEST_PRODUCT_ID, TEST_BRAND_ID, periodDate);
		Products productFinal;
		LocalDateTime startDate;
		LocalDateTime endDate;
		//then
		boolean checkDate;
		if(products != null) {
			for (Products product : products) {
				startDate = product.getStartDate();
				endDate = product.getEndDate();
				checkDate = periodDate.isAfter(startDate) && periodDate.isBefore(endDate);
				LOGGER.info("rango de fecha::  fecha de inicio --> " + startDate + " fecha de inicio --> " + endDate);
				productFinal = Products.builder()
						.id(product.getId())
						.productId(product.getProductId())
						.BrandId(product.getBrandId())
						.priceList(product.getPriceList())
						.startDate(product.getStartDate())
						.endDate(product.getEndDate())
						.price(product.getPrice())
						.build();

				if (checkDate) {
					LOGGER.info(TEST_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertTrue(checkDate, "obtenemos el pricelist");
				} else {
					LOGGER.info(TEST_NOT_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertFalse(checkDate, "el price list obtenido no es valido");

				}
			}
		}
	}

	@DisplayName("Test peticion a las 21:00 del dia 16 del producto 35455")
	@Test
	@Order(5)
	void testCase5() {
		//given
		//when
		LocalDateTime TEST_DATE = LocalDateTime.parse("2020-06-16T21:00:00");
		DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime periodDate = LocalDateTime.parse(TEST_DATE.format(dateTimeFormatter));
		List<Products>  products = priceController.getProductById(TEST_PRODUCT_ID, TEST_BRAND_ID, periodDate);
		Products productFinal;
		LocalDateTime startDate;
		LocalDateTime endDate;
		//then
		boolean checkDate;
		if(products != null) {
			for (Products product : products) {
				startDate = product.getStartDate();
				endDate = product.getEndDate();
				checkDate = periodDate.isAfter(startDate) && periodDate.isBefore(endDate);
				LOGGER.info("rango de fecha::  fecha de inicio --> " + startDate + " fecha de inicio --> " + endDate);
				productFinal = Products.builder()
						.id(product.getId())
						.productId(product.getProductId())
						.BrandId(product.getBrandId())
						.priceList(product.getPriceList())
						.startDate(product.getStartDate())
						.endDate(product.getEndDate())
						.price(product.getPrice())
						.build();

				if (checkDate) {
					LOGGER.info(TEST_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertTrue(checkDate, "obtenemos el pricelist");
				} else {
					LOGGER.info(TEST_NOT_VALID);
					LOGGER.info("producto Final:: " + productFinal);
					assertFalse(checkDate, "el price list obtenido no es valido");

				}
			}
		}
	}
}
