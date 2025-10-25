package com.andre.bootcampdevjr_cadastro_vendedores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.bootcampdevjr_cadastro_vendedores.repository.SellerRepository;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository sellerRepository;

    

}
