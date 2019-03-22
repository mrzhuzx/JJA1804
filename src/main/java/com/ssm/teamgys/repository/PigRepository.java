package com.ssm.teamgys.repository; /*
 *desc:
 *author:wjs
 *time:2019/3/22 0022
 *version:1.2.3
 */

import com.ssm.teamgys.entity.Pig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PigRepository extends JpaRepository<Pig,Integer> {


    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update Pig  set pigHobby=?2 where pigId=?1 ")
    int  updatePig(Integer pigId,String pigHobby);


}
