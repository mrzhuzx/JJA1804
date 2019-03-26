package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductCategoryService extends BaseService<ProductCategory> {

void update(String categoryId, String categoryName );
    ProductCategory findbyid(String categoryId);

}
