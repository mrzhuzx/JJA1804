package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmsProvider;
import org.springframework.stereotype.Service;

/**
 * time：2019/3/25--15:52
 * Author:lanxj
 * desc:
 * version:1.3.22
 */

public interface SmbmsProviderService extends BaseService<SmbmsProvider> {
     Integer updateById(Long proId,String proName);
}
