package com.milo.shopping_software.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "\"Supplier_Order_Items\"")
public class SupplierOrderItem {
    @Id
    @Column(name = "item_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private SupplierOrder order;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}