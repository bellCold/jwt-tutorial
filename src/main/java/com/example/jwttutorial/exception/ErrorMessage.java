package com.example.jwttutorial.exception;

public enum ErrorMessage {
    ALREADY_EXIST_USER("이미 가입되어 있는 유저입니다.");


    public final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}
