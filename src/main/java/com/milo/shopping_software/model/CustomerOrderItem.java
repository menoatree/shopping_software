package com.milo.shopping_software.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "\"customer_order_items\"")
public class CustomerOrderItem {
    @Id
    @Column(name = "item_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private CustomerOrder order;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;


}