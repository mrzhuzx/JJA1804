package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * time：2019/3/2214:40
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> {

    @Transactional
    @Modifying(clearAutomatically = true) //
    @Query(" update Cat set catName=?2 where catId=?1")
    int update(Integer catId,String catName);

    @Transactional
    @Modifying(clearAutomatically =true)
    @Query("update Cat c set c.catAge=:catAge where c.catId=:catId")
    int updateName(Integer catId,String catAge);
}
