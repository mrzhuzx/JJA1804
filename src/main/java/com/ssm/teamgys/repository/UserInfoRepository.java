package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:zhs
 * time:2019-03-25  13:56:15
 */
@Repository   //数据仓库DAO
public interface UserInfoRepository extends JpaRepository<Userinfo, Integer> {





}
