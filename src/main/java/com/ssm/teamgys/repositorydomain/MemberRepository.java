package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.Member;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface MemberRepository extends JpaRepository<Member,Long>{





}
