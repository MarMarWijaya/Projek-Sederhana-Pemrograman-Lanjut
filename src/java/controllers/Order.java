/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mario Wijaya
 */
public class Order {

    String orderNo;
    String productName;
    BigDecimal price;
    int qty;

    public Order(String orderNo, String productName,
            BigDecimal price, int qty) {
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
