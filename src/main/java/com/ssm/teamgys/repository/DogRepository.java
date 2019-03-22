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


    @Transactional
    @Modifying(clearAutomatically = true) //    代码提示ctrl+p
    @Query(" update Dog set dogHobby=?2 where dogId=?1") // :dogHobby
    int  update(Integer dogId,String dogHobby);


}
