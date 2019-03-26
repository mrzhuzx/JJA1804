package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * time：2019/3/25--15:59
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Repository
public interface SmbmsProviderRepository extends JpaRepository<SmbmsProvider,Long> {


    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsProvider set proName=?2 where proId=?1")
    Integer updateById(Long proId,String proName);
}
