package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmRole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface SmbmRoleRepository extends JpaRepository<SmbmRole,Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update SmbmRole set roleName=?2,roleDesc=?3,roleStatus=?4,roleCode=?5 where roleId=?1")
    int update( Long roleId,String roleName,String roleDesc,Integer roleStatus, String roleCode);




}
