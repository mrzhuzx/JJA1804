package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmsAddress;
import com.ssm.teamgys.service.impl.SmbmsAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * time：2019/3/25--15:47
 * Author:lanxj
 * desc:
 * version:1.3.22
 */

public interface SmbmsAddressService extends BaseService<SmbmsAddress> {


}
