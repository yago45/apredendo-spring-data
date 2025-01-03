package com.yago.aprendo.spring.data.infrastructure.exceptions;

public class ConflictException extends RuntimeException{

    public ConflictException(String mensagem){
        super(mensagem);
    }
    public ConflictException(String mensagem,Throwable throwable){
        super(mensagem);

    }

}
