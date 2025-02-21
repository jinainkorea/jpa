package com.ll.sb_25_01.domain.membr.service;

import com.ll.sb_25_01.domain.member.entity.Member;
import com.ll.sb_25_01.domain.member.service.MemberService;
import com.ll.sb_25_01.global.rsData.RsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ActiveProfiles("test")
@Transactional
@Rollback(false)
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;
    @DisplayName("회원가입")
    @Test
    void t1() {
        RsData<Member> joinRs = memberService.join("user1", "1234");
        Member member = joinRs.getData();
        assertThat(member.getId()).isGreaterThan(0L);  // 검증 코드; 검증되면 테스트 통과, 되지않으면 테스트 실패가 된다.
    }
}
