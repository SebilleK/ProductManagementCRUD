package com.sebillek.products.service;


import com.sebillek.products.entity.Product;
import com.sebillek.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /* POST */

    public Product saveProduct(Product product) {
        return repository.save(product);

    }

    public List<Product> saveProductList (List<Product> products){
        return repository.saveAll(products);
    }

    /* GET */

    public Product getProductbyId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    /* get product by name, custom query — method created in ProductRepository */
    public Product getProductbyName(String name) {
        return repository.findByName(name);
    }

    /* UPDATE */
     public Product updateProduct(Product product) {
         Product existingProduct = repository.findById(product.getId()).orElse(null);

         if (existingProduct != null) {
             existingProduct.setName(product.getName());
             existingProduct.setQuantity(product.getQuantity());
             existingProduct.setPrice(product.getPrice());
             return repository.save(existingProduct);
         }

         return null;

     }

     /* DELETE */

    public String deleteProduct (Integer id){
        repository.deleteById(id);
        return "Product successfully removed from the database, ID: " + id;
    }


}
