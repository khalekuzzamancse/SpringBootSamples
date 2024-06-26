package com.kzcse.springboot.enitity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InventoryEntity {
    @Id
    private String pid;
    private int quantity;

}
