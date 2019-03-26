package com.ssm.teamgys.repositorydomain; /*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SmbmUserRepository extends JpaRepository<SmbmUser,Long> {
   int update(String userCode, String userName, String userPassword, String userPhone, Long roleId);

//    @Transactional
////
////    @Modifying(clearAutomatically = true)
////    @Query("update SmbmUser set ")
////    int update(Long userId,Integer )

}
