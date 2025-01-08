package com.ll.sb_25_01.domain.article.service;

import com.ll.sb_25_01.domain.article.entity.Article;
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
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;
    @DisplayName("글 작성")
    @Test
    void t1() {
        RsData<Article> writeRs = articleService.write(1, "제목1", "내용1");
        Article article = writeRs.getData();
        assertThat(article.getId()).isGreaterThan(0L);  // 검증 코드; 검증되면 테스트 통과, 되지않으면 테스트 실패가 된다.
    }
}
