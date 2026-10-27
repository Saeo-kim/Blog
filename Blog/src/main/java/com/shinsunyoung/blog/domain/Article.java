package com.shinsunyoung.blog.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.ErrorResponse;


public class Article {
    public static ErrorResponse.Builder builder() {
        return null;
    }

    // IntelliJ 자동 임포트 방법

    //값을 매개변수를 받지 않는 기본 생성자(Default Constructor) 받음
    // 기본 생성자: 매개변수를 받지 않는 생성자
    //JPA가 SELECT 구문으로 행 레코드를 조회해서 읽을 떄 이 기본 생성자로 객체를 먼저 만든 뒤, 열 값을 변수에 채워 넣음.
    //PROTECTED
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    // @Getter :
    @Getter
    @Entity
    public class Article {


        //getter 메소드들. 다 롬복으로 대체될 것임.
        //어노테이션 붙일거임. 다 적어놓고 붙이는 것
        @Id     //글 id
        //insert 구문을 작성할 때 id 열 값을 개발자가 넣지 않고, DB가 1,2,3 등 순서대로 자동 생성해 insert 해주는 설정
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false)
        // updatable = false 란 update 구문으로 id 값을 바꿀 수 없습니다.
        private Long id;

        //변수마다 컬럼 어노테이션 적는 이유: 각 변수마다 DB에서 맡는 역할과 규칙이 다르기 때문
        @Column(name = "title", nullable = false)
        // nullable = false => NOT NULL 제약 조건
        private String title;
        //글 내용 return

        // @Column(name = "content", nullable = false) 어노테이션 구조 암기법
        @Column(name = "content", nullable = false)
        private String content;

        //Lombok에서 제공. 객체를 빌더 방식으로 만들 수 있게 해주는 lombok 어노테이션
        //자동으로 생기는 메소드: builder(), 아래 생성자의 매개변수 값을 한 줄씩 적어서 객체를 만들 수 있음
        // ex. Article객체 만들기 위한 Builder객체 반환. Title위한 content관한 메소드 등등
        // Article.builder().title("제목").content("내용").build()
        //-> 안에서 new Article("제목", "내용")과 같은 일을 한다.
        // 명확하게 글 내용을 명확하게 메소드 이름 붙여줌
        // 빌더 패턴임. 쓰라는 법은 없지만...
        // 생성자 호출하는 장소가 add.article 뭐시기로 test 코드로 호출함.


    }
}
