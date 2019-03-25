package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.appcomm.enums.MemberEnums;
import com.ssm.teamgys.domain.Member;
import com.ssm.teamgys.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MemberServiceImplTest   {

    @Autowired
    MemberService memberService;

    @Test
    public void testSave() {
        Member m=new Member();
        m.setMName("周杰伦");
        m.setMNumber("NO007");
        m.setMFaceImg("img/face/lyf.jpg");
        m.setMGrade(MemberEnums.mGradeT3.getDesc());
        m.setMJob("项目经理");
        m.setMSkill("JAVA/JS/HTML/DB/LINUX");
        m.setMStatus("在职");
        m.setMItemId(1);
        memberService.save(m);

    }

    @Test
    public void test() {

        List<Member> memberList = memberService.findAll();
        for (Member member : memberList) {
            System.out.println(member.toString());
        }

    }
}