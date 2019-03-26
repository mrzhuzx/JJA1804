package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.ProductInfo;
import com.ssm.teamgys.repositorydomain.ProductInfoRepository;
import com.ssm.teamgys.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/3/25 0025
 * version: 1.2.3
 */
@Service
public class ProductInfoServiceImpl   implements ProductInfoService {

    //注入数据层
    @Autowired
    ProductInfoRepository productInfoRepository;  //产品数据层


    @Override
    public ProductInfo findOne(String productId) {
        return productInfoRepository.getOne(productId);
    }

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findAll();
    }

    @Override
    public void delete(String productId) {

        productInfoRepository.deleteById(productId);

    }

    @Override
    public void findone(String productId) {

        productInfoRepository.getOne(productId);
    }


    @Override
    public List<ProductInfo> findsearch() {
        return productInfoRepository.findAll();
    }



    @Override
    public void updateone(String productId,Integer productStatus) {

        productInfoRepository.update(productId,productStatus);
    }


    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

    @Override
    public ProductInfo saveall(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }


}
