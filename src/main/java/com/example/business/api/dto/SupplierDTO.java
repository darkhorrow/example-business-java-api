package com.example.business.api.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SupplierDTO implements Serializable {
    private Long id;

    private String name;

    private String country;

    @JsonBackReference
    private Set<ItemDTO> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<ItemDTO> getItems() {
        return items;
    }

    public void setItems(Set<ItemDTO> items) {
        this.items = items;
    }

    public void addItem(ItemDTO item) {
        if(items == null) {
            items = new HashSet<>();
        }
        items.add(item);
    }
}
