package com.andre.bootcampdevjr_cadastro_vendedores.dto;

import com.andre.bootcampdevjr_cadastro_vendedores.model.Seller;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SellerRequest {

    @NotBlank(message = "Name can not be blank.")
    @Column(nullable = false, length = 255)
    private String name;
    private Double salary;
    private Double bonus;
    @Size(min = 1, max = 2, message = "Invalid gender.")
    private Integer gender;

    public Seller toEntity() {
        Seller seller = new Seller();
        seller.setName(name);
        seller.setGender(gender);
        seller.setSalary(salary);
        seller.setBonus(bonus);

        return seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}
