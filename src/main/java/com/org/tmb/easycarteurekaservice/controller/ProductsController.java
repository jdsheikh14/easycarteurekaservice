package com.org.tmb.easycarteurekaservice.controller;

import com.org.tmb.easycarteurekaservice.mapper.ProductsMapper;
import com.org.tmb.easycarteurekaservice.model.ProductsModel;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/easycart")
public class ProductsController {

    @Resource
    private ProductsMapper productsMapper;

    //mappings
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Products Details Webpage";
    }

    @GetMapping("/getAllProducts")
    public ArrayList<ProductsModel> getAllProducts() {
        return productsMapper.getAllProducts();
    }

    @GetMapping("/getProduct")
    public ProductsModel getProductbyId(@RequestParam int id) {
        return productsMapper.getProductbyId(id);
    }

    @PostMapping("/newProduct")
    public int newProduct(@RequestBody ProductsModel productsModel)
    {
        return productsMapper.newProduct(productsModel);
    }

    @PutMapping("/updateProduct")
    public int updateProduct(@RequestBody ProductsModel productsModel)
    {
        return productsMapper.updateProduct(productsModel);
    }



}
