package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * desc:
 * author:czf
 * time:2019\3\25 0025
 * version:
 */
public interface TeamRepository extends JpaRepository<Team,Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update team set teamName=?2 where teamId=?1")
    int  update(Long teamId ,String teamName);
}
