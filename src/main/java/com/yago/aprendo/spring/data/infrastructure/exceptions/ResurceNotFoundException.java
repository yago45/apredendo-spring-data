package com.yago.aprendo.spring.data.infrastructure.exceptions;

public class ResurceNotFoundException extends RuntimeException {

    public ResurceNotFoundException(String mensagem){
      super(mensagem);
    }
    public ResurceNotFoundException(String mensagem , Throwable throwable ){
        super(mensagem ,throwable  );
    }
}
