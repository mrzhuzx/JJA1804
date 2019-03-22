package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Brid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * lxh
 * Brid类的接口
 */
@Repository  //数据层注解
public interface BridRepository extends JpaRepository<Brid,Integer> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update Brid set bridColor =?2 where bridId=?1 ")//修改
    int update(Integer bridId,String bridColor);




}
