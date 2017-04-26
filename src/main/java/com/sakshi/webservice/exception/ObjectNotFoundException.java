package com.sakshi.webservice.exception;

/**
 * Created by Sakshi Kukreti on 25-04-2017.
 */
public class ObjectNotFoundException extends  RuntimeException{
    public ObjectNotFoundException(String message){
        super(message);
    }
}
