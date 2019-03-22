package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * desc:
 * author : tzhu
 * time :2019/3/22 0022
 * version: 1.2.3
 * ctrl+shfit+T
 */
@Repository
public interface DogRepository  extends JpaRepository<Dog,Integer> {
    //CURD


    @javax.transaction.Transactional
    @Modifying(clearAutomatically = true) //    代码提示ctrl+p
    @Query(" update Dog set dogHobby=?2 where dogId=?1") // :dogHobby   hibernate :  HQL QBC
    int  update(Integer dogId,String dogHobby);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Dog d set d.dogName=:dogName where d.dogId=:dogId") //对象查询语句
    int updateDogName(Integer dogId,String dogName);


}
