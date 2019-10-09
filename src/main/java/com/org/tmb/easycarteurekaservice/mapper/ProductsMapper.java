package com.org.tmb.easycarteurekaservice.mapper;

import com.org.tmb.easycarteurekaservice.model.ProductsModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

@Mapper
public interface ProductsMapper {

    @Select("select * from product")
    ArrayList<ProductsModel> getAllProducts();

    @Select("select * from product where id=#{id}")
    ProductsModel getProductbyId(int id);

    @Insert("insert into product(product_name,parent_id, description, type_id, icon_id, promotion_id, total_products, in_stock_products, price) values (#{product_name},#{parent_id},#{description},#{type_id},#{icon_id},#{promotion_id},#{total_products},#{in_stock_products},#{price})")
    int newProduct(ProductsModel productsModel);

    @Update("update product set product_name=#{product_name},parent_id=#{parent_id},description=#{description}, type_id=#{type_id}, icon_id=#{icon_id}, promotion_id=#{promotion_id}, total_products=#{total_products}, in_stock_products=#{in_stock_products}, price=#{price} where id=#{id}")
    int updateProduct(ProductsModel productsModel);


}
