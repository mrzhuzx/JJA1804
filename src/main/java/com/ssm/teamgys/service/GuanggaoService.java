package com.ssm.teamgys.service;


import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.Guanggao;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import java.util.List;


public interface GuanggaoService extends BaseService<Guanggao> {
    int update(String ggTitle, String ggImg, String ggUrl,long ggId);

}
