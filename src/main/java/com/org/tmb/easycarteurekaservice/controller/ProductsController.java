package com.org.tmb.easycarteurekaservice.controller;

import com.org.tmb.easycarteurekaservice.mapper.ProductsMapper;
import com.org.tmb.easycarteurekaservice.model.ProductsModel;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author Junaid Atta 08/October/2019
 * @version 1.0 ProductsController holds the APIs to be used
 * for products related operations.
 * The resulted response data: object will contain key name in key and
 * value object in value key. JSON FORMAT
 */

@RestController
@RequestMapping("/easycart")
public class ProductsController {

    @Resource
    private ProductsMapper productsMapper;

    //following are the API EndPoints

    //homepage
    @GetMapping("/")
    public String welcome() {
        return "Welcome to EasyCart Products Details Webpage";
    }

    //getting all products
    @GetMapping("/getAllProducts")
    public ArrayList<ProductsModel> getAllProducts() {
        return productsMapper.getAllProducts();
    }

    //getting products by id
    @GetMapping("/getProduct")
    public ProductsModel getProductbyId(@RequestParam int id) {
        return productsMapper.getProductbyId(id);
    }


    //inserting product
    @PostMapping("/newProduct")
    public int newProduct(@RequestBody ProductsModel productsModel) {
        return productsMapper.newProduct(productsModel);
    }

    //updating product
    @PutMapping("/updateProduct")
    public int updateProduct(@RequestBody ProductsModel productsModel) {
        return productsMapper.updateProduct(productsModel);
    }

    //deleting product
    @DeleteMapping("/deleteProduct")
    public int deleteProduct(@RequestBody ProductsModel productsModel) {
        return productsMapper.deleteProduct(productsModel);
    }

}
