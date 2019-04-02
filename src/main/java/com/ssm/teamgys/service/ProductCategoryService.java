package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface ProductCategoryService extends BaseService<ProductCategory> {

int update(String categoryId, String categoryName, Integer categoryType  );
    ProductCategory findbyid(String categoryId);


}
