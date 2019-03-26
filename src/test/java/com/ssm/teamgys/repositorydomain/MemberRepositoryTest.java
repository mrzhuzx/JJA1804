package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.appcomm.enums.MemberEnums;
import com.ssm.teamgys.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void test(){
        Member m=new Member();
        m.setMName("周杰伦");
        m.setMNumber("NO007");
        m.setMFaceImg("img/face/lyf.jpg");
        m.setMGrade(MemberEnums.mGradeT3.getDesc());
        m.setMJob("项目经理");
        m.setMSkill("JAVA");
        m.setMStatus("在职");
        m.setMItemId(1);
        memberRepository.save(m);
        Member mt = new Member();
        mt.setMName("王朝");
        mt.setMNumber("N0008");
        mt.setMGrade("img/face/lyf.jpg");
        mt.setMGrade("五级");
        mt.setMJob("开发者");
        mt.setMSkill("JAVA");
        mt.setMStatus("在职");
        mt.setMItemId(2);
        memberRepository.save(mt);

    }




}