package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsBill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


public interface SmbmsBillRepository extends JpaRepository<SmbmsBill,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update SmbmsBill set productName=?2 where billId=?1")
    int  update(Long billId ,String productName);

}
