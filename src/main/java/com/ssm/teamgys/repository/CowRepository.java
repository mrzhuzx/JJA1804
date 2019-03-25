package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Cow;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * desc:
 * author :you
 * time: 2019-3-22 14:28:37
 */
@Repository
public interface CowRepository extends JpaRepository<Cow,Integer> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update Cow set userHobby=?2 where userId=?1")
     int update(Integer userId,String userHobby);
}
