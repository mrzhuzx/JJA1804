package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsAddress;
import org.hibernate.sql.Update;
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
public interface SmbmsAddressRepository extends JpaRepository<SmbmsAddress,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsAddress set addContact=?2 where addId=?1")
    Integer updateById(Long addId,String addContact);
}
