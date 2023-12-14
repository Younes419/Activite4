package org.sid.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.model.Product;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItems {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Product product;
    private Long productId;
    private double price;
    private int quantity;
    private double discount;
    @ManyToOne
    private Order order;
}
