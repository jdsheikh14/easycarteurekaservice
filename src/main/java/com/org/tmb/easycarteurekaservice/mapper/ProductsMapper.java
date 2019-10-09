package com.org.tmb.easycarteurekaservice.mapper;

import com.org.tmb.easycarteurekaservice.model.ProductsModel;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;

/**
 * @author Junaid Atta 08/October/2019
 * @version 1.0
 * @since v1.0
 * Works as {@link Mapper} marker for model {@link ProductsModel}.
 */

@Mapper
public interface ProductsMapper {

    //selecting all products from database
    @Select("select * from product")
    ArrayList<ProductsModel> getAllProducts();

    //selecting a product from database of specific id
    @Select("select * from product where id=#{id}")
    ProductsModel getProductbyId(int id);

    //inserting a product into database
    @Insert("insert into product(product_name,parent_id, description, type_id, icon_id, promotion_id, total_products, in_stock_products, price) values (#{product_name},#{parent_id},#{description},#{type_id},#{icon_id},#{promotion_id},#{total_products},#{in_stock_products},#{price})")
    int newProduct(ProductsModel productsModel);

    //updating a product in database
    @Update("update product set product_name=#{product_name},parent_id=#{parent_id},description=#{description}, type_id=#{type_id}, icon_id=#{icon_id}, promotion_id=#{promotion_id}, total_products=#{total_products}, in_stock_products=#{in_stock_products}, price=#{price} where id=#{id}")
    int updateProduct(ProductsModel productsModel);

    //deleting a product from database
    @Delete("delete from product where id=#{id} ")
    int deleteProduct(ProductsModel productsModel);
}
