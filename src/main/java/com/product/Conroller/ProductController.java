package com.product.Conroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.product.Services.ProductServices;
import com.product.entities.Product;
@RestController
public class ProductController {
	@Autowired
	private ProductServices productServices;
	
	// controller for all product
	@GetMapping("/product")
	public List<Product> getproduct() {
		
		return this.productServices.getAllname();	
	}
	
	// controller for single product
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		
		return productServices.getById(id);
		
	}
	
	// controller for delete the product 
	
	@DeleteMapping("/product/{id}")
	public void productDelete(@PathVariable("id") int id) {
		
		
		this.productServices.deleteproduct(id);
	 
	}

// Controller for adding the Product
	@PostMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		
		Product p= this.productServices.updatesProduct(product);
		return p;
		
		
	}

}
