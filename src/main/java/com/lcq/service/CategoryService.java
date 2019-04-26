package com.lcq.service;

import com.lcq.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by lcq
 * 2019-04-20 10:20
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}