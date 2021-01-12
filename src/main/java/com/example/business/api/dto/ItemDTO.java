package com.example.business.api.dto;

import com.example.business.api.model.ItemStateEnum;
import com.example.business.api.model.PriceReduction;
import com.example.business.api.model.Supplier;
import com.example.business.api.model.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class ItemDTO {
    private Long id;

    private Long code;

    private String description;

    private Double price;

    private ItemStateEnum state;

    private Set<SupplierDTO> suppliers;

    private List<PriceReductionDTO> priceReductions;

    private LocalDateTime creationDate;

    private UserDTO creator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ItemStateEnum getState() {
        return state;
    }

    public void setState(ItemStateEnum state) {
        this.state = state;
    }

    public Set<SupplierDTO> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<SupplierDTO> suppliers) {
        this.suppliers = suppliers;
    }

    public List<PriceReductionDTO> getPriceReductions() {
        return priceReductions;
    }

    public void setPriceReductions(List<PriceReductionDTO> priceReductions) {
        this.priceReductions = priceReductions;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public UserDTO getCreator() {
        return creator;
    }

    public void setCreator(UserDTO creator) {
        this.creator = creator;
    }
}