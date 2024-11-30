package org.survey.db;

public enum BaseStatus {

    REGISTERED("등록"),
    UNREGISTERED("삭제"),
    ;

    BaseStatus(String description){
        this.description = description;
    }
    private String description;
}