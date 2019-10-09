package com.org.tmb.easycarteurekaservice.model;

/**
 * @author Junaid Atta 08/October/2019
 * This class represents and stores the information about the products.
 * This class persist the Information
 * about Products in database. This POJO is used.
 * whole information persisted by this class is stored in the plugged in data
 * base
 */

public class ProductsModel {
    private String id;
    private String product_name;
    private String parent_id;
    private String description;
    private String type_id;
    private String icon_id;
    private String promotion_id;
    private String total_products;
    private String in_stock_products;
    private int price ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(String icon_id) {
        this.icon_id = icon_id;
    }

    public String getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(String promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getTotal_products() {
        return total_products;
    }

    public void setTotal_products(String total_products) {
        this.total_products = total_products;
    }

    public String getIn_stock_products() {
        return in_stock_products;
    }

    public void setIn_stock_products(String in_stock_products) {
        this.in_stock_products = in_stock_products;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
