package com.example.impinjmysqlspring.repository;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventory_tag")
public class InventoriedTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String EPC;
    private short ant_num;
    private double chn_num;

}
