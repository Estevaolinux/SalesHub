package com.saleshub.domain;
import jakarta.persistence.*; import java.math.BigDecimal;
@Entity @Table(name="sale_items") public class SaleItem { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Product product; private int quantity; private BigDecimal unitPrice,lineTotal; protected SaleItem(){} public SaleItem(Product p,int q){product=p;quantity=q;unitPrice=p.getPrice();lineTotal=unitPrice.multiply(BigDecimal.valueOf(q));} public Product getProduct(){return product;} public int getQuantity(){return quantity;} }
