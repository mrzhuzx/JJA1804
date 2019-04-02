package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.ProductCategory;
import com.ssm.teamgys.domain.ProductInfo;
import com.ssm.teamgys.service.ProductCategoryService;
import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryService productCategoryService;

    @Test
    public void findAll() {
        List<ProductCategory> list = productCategoryService.findAll();

        log.info("ProductCategory:    " + list);
    }

    @Test
    public void findAll1() {

        Sort sort=new Sort(Sort.Direction.ASC,"categoryId");//属性名dogid XXX
        Integer pageNum=1; //  2   3页
        Integer size=4;

        PageRequest pageable = new PageRequest(pageNum-1, size,new Sort(Sort.Direction.ASC,"categoryId")); //根据start、size、sort创建分页对象

        Page<ProductCategory> page = productCategoryService.findAll(pageable);

        List<ProductCategory> content = page.getContent();
        for (int i = 0; i < content.size(); i++) {

            ProductCategory   pro = content.get(i);
            log.info(pro.toString());
        }

    }

    @Test
    public void findbyid() {

      ProductCategory byId = productCategoryService.findbyid("1");
        log.info("______"+byId.toString());
    }

    @Test
    public void count() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void deleteAll() {
    }

    @Test
    public void deleteAll1() {
    }

    @Test
    public void save() {
        ProductCategory pro = new ProductCategory();
        //  pro.setCategoryId(MYUUID.getYYYYMMDDhhmmss());
        pro.setCategoryName("牧羊犬");
        pro.setCategoryType(1001);
        pro.setCreateTime(new Date());
        productCategoryService.save(pro);
        System.out.println(pro);

    }


}