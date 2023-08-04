package com.example.db_jpa_template.practice.ex.exception;

import lombok.Getter;

@Getter
public class MemberException extends RuntimeException{
    private final MemberErrorCode mec;
    private final String message;

    public MemberException(MemberErrorCode mec){
        super(mec.getErrorMessage());
        this.mec = mec;
        this.message =mec.getErrorMessage();
    }
}
