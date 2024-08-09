package com.example.ProductMicroservice.service;

import com.example.ProductMicroservice.dto.CreateProductDto;
import org.apache.kafka.common.protocol.types.Field;

import java.util.concurrent.ExecutionException;

public interface ProductService {

    String createProduct(CreateProductDto createProductDto) throws ExecutionException, InterruptedException;
}
