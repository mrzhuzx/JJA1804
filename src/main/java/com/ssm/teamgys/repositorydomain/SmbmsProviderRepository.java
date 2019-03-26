package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * time：2019/3/25--15:59
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Repository
public interface SmbmsProviderRepository extends JpaRepository<SmbmsProvider,Long> {
}
