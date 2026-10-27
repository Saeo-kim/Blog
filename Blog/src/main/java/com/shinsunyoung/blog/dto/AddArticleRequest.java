package com.shinsunyoung.blog.dto;
// DTO(Data Transfer Object) : 브라우저와 주고받은 데이터 담는 객체

import com.shinsunyoung.blog.domain.Article;

public class AddArticleRequest { //글 정보 하나 저장해서 전달할 용도

    //글제목을 저장하는 변수.
    //{"title":"글제목"} JSON 데이터의 "title" 키와 같은 이름이라서, 요청메세지의 title 값이 이 변수에 저장됩니다.
    private String title; //

    //글 내용을 저장하는 변수
    //{"content":"글내용"} json 데이터의 "content" 키와 같은 이름의 변수라서, 값으로 "글내용"을 content변수에 저장하게 됨
    private String content;

    //toEntity() 메소드 : 요청한 새글 데이터(AddArticleRequest의 변수정보들)을
    //                   Article엔티티 클래스의 @Builder 어노테이션이 붙은 생성자를 호출해
    //                  new Article("글제목","글내용");
    public Article toEntity(){

        //return :
        return Article.builder()
                .title(this.title)
                .content(this.content)
                .build();

    }

}
