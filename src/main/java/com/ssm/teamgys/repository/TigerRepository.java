package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Tiger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * desc:
 * author:czf
 * time:2019\3\22 0022
 * version:
 */
@Repository
public interface TigerRepository extends JpaRepository<Tiger,Integer> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update Tiger  set tigerHobby=?2 where tigerId=?1")
    int update(Integer tigerId,String tigerHobby);

}
