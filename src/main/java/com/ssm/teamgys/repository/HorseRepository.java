package com.ssm.teamgys.repository;

import com.ssm.teamgys.entity.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */

@Repository
public interface HorseRepository extends JpaRepository<Horse,Integer> {





}
