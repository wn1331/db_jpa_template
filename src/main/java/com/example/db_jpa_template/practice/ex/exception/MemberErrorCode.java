package com.example.db_jpa_template.practice.ex.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum MemberErrorCode {
    NOT_FOUND(HttpStatus.NOT_FOUND.value(),"회원 정보가 없습니다."),

    NOT_EVALUATE(400,"오류 1번");

    private int errorCode;
    private String errorMessage;

}
