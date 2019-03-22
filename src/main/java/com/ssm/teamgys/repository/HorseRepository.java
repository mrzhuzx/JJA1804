package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Horse;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * desc:
 * author:lzp
 * {time}2019-3-22 14:29:44
 * version:1.2.3
 */

@Repository
public interface HorseRepository extends JpaRepository<Horse,Integer> {


   @Transactional
    @Modifying(clearAutomatically =true)
    @Query("update Horse  set horsehobby=?2 where horseId=?1")
    int update(Integer horseId, String horsehobby);







}
