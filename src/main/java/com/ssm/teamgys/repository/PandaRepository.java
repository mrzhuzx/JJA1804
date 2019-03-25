package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Panda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


public interface PandaRepository extends JpaRepository<Panda,Integer> {
   @Transactional
   @Modifying(clearAutomatically = true)
   @Query(" update Panda set Pandacolor=?2 where Pandaid=?1")
   int  update(Integer Pandaid,String Pandacolor);

@Transactional
   @Modifying
   @Query("update  Panda  SET  pandaname=?3,pandaage=?2 where pandaid=?1 ")
   int updeteone(Integer Pandaid,Integer Pandaage,String Pandaname);

}
