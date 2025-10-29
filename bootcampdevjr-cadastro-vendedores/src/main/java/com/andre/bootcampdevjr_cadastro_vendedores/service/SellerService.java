package com.andre.bootcampdevjr_cadastro_vendedores.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.bootcampdevjr_cadastro_vendedores.dto.SellerRequest;
import com.andre.bootcampdevjr_cadastro_vendedores.dto.SellerResponse;
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

        return seller.toDTO();
    }

    public List<SellerResponse> getAll() {
        return sellerRepository.findAll()
                .stream()
                .map(s -> s.toDTO())
                .collect(Collectors.toList());
    }

    public SellerResponse save(SellerRequest sellerRequest) {
        Seller seller = sellerRepository.save(sellerRequest.toEntity());
        return seller.toDTO();
    }

    public void deleteById(long id) {
        if (!sellerRepository.existsById(id)) {
            throw new EntityNotFoundException("Seller not found.");
        }

        sellerRepository.deleteById(id);
    }

    public void update(long id, SellerRequest sellerRequest) {

        Seller seller = sellerRepository.getReferenceById(id);

        seller.setName(sellerRequest.getName());
        seller.setGender(sellerRequest.getGender());
        seller.setSalary(sellerRequest.getSalary());
        seller.setBonus(sellerRequest.getBonus());
    }

}
