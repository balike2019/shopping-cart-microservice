package com.balikeOnline.ProductService;

import com.balikeOnline.ProductService.model.Product;
import com.balikeOnline.ProductService.repository.ProductRepository;
import com.balikeOnline.ProductService.service.ProductServiceImple;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductServiceApplicationTests {
	@Autowired
 ProductRepository productRepository;
	//@Test
	//void contextLoads() {
	//}
	@Test
	public void testCreate(){
		Product product=new Product();
				product.setProductName("Nokia");
		product.setDescription("Nokia Android");
		product.setPrice(BigDecimal.valueOf(500));
		productRepository.save(product);//save(product);
		assertNotNull(productRepository.findAll().size());
	}
	@Test
public void getProductAll(){
		List<Product> list=productRepository.findAll();
		//assertThat(list).size().isGreaterThan(0);


}
}
