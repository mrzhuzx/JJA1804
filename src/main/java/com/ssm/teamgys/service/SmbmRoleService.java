package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmRole;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface SmbmRoleService extends BaseService<SmbmRole> {

    int update( Long roleId,String roleName,String roleDesc,Integer roleStatus,String roleCode );
}
