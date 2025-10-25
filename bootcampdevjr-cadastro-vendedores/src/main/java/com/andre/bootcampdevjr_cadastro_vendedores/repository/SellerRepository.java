package com.andre.bootcampdevjr_cadastro_vendedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andre.bootcampdevjr_cadastro_vendedores.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
