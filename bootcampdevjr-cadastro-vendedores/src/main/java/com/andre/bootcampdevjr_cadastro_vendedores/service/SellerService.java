package com.andre.bootcampdevjr_cadastro_vendedores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.bootcampdevjr_cadastro_vendedores.model.Seller;
import com.andre.bootcampdevjr_cadastro_vendedores.repository.SellerRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository sellerRepository;

    public SellerResponse getById(long id) {
        Seller seller = sellerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Seller not found."));

        
    }

}
