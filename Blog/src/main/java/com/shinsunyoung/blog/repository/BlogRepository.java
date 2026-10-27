package com.shinsunyoung.blog.repository;

import com.shinsunyoung.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// public interface BlogRepository : article 테이블에 접근하는 기능 목록. 인터페이스이므로
// Long : Article

// 구현 객체 : 스프링 데이터 JPA가 프로그램 시작 때 이 인터페이스의 구현 객체를 만들고,
// DefaultListableBeanFactory 객체가 빈으로 보관합니다.
public interface BlogRepository extends JpaRepository<Article, Long> {

    // 이 안에는 메소는 적지 않았습니다. 아래 기본 메소드는 JpaRepository에서 물려받음.
    // save(article) : id가 없으면 insert 구문으로 새 행 레코드를 추가하고, id가 있으면 해당 행을 수정
    // findAll() : select 구문으로 article 테이블의 모든 행 레코드를 조회한다.

}
