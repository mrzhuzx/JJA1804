package com.ssm.teamgys.service;


import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.Guanggao;




public interface GuanggaoService extends BaseService<Guanggao> {
    int update(String ggTitle, String ggImg, String ggUrl,long ggId);

}
