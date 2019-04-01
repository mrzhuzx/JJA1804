package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.ProductInfo;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * desc:
 * author : zhs
 * time :2019-03-25  15:37:07
 * version: 1.2.3
 */
@Repository  //数据仓库DAO
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

@Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update ProductInfo set productStatus=?2 where productId=?1")
     int  update(String productId,Integer productStatus);


}
