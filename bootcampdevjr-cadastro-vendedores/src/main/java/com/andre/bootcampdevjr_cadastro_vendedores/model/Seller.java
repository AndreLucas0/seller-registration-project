package com.andre.bootcampdevjr_cadastro_vendedores.model;

import com.andre.bootcampdevjr_cadastro_vendedores.dto.SellerResponse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TBL_SELLER")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name can not be blank.")
    @Column(nullable = false, length = 255)
    private String name;
    private Double salary;
    private Double bonus;
    @Size(min = 1, max = 2, message = "Invalid gender.")
    private Integer gender;

    public Seller(Long id, String name, Double salary, Double bonus, Integer gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.gender = gender;
    }

    public Seller() {
    }

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

    public SellerResponse toDTO() {
        SellerResponse sellerResponse = new SellerResponse();
        sellerResponse.setId(id);
        sellerResponse.setName(name);
        sellerResponse.setGender(gender);
        sellerResponse.setSalary(salary);
        sellerResponse.setBonus(bonus);

        return sellerResponse;
    }

}
