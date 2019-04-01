package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.Guanggao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Repository
public interface GuanggaoRepository extends JpaRepository<Guanggao,Long> {
    @Transactional
    @Modifying(clearAutomatically = true)

    @Query("update Guanggao set ggTitle=?1,ggImg=?2,ggUrl=?3 where ggId=?4")
    int update(String ggTitle, String ggImg, String ggUrl,long ggId);
}
