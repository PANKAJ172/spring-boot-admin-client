package com.springadmin.client1.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author PANKAJ JANGID
 * @created 21/06/2022 - 12:15 AM
 */
@Data
@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
