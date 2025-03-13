package com.milo.shopping_software.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "\"customer_orders\"")
public class CustomerOrder {
    @Id
    @Column(name = "order_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "order_date", nullable = false)
    private Instant orderDate;

    @Column(name = "delivery_date")
    private Instant deliveryDate;

    @Column(name = "total_cost", precision = 12, scale = 2)
    private BigDecimal totalCost;

    @ColumnDefault("'pending'")
    @Column(name = "status", length = 20)
    private String status;

}