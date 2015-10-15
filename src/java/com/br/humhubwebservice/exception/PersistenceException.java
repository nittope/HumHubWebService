/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.humhubwebservice.exception;

/**
 *
 * @author Marcus Vinicius
 */
public class PersistenceException extends RuntimeException {
    
    public PersistenceException(String msg){
        super(msg);
    }
    public PersistenceException (Exception ex){
        super(ex);
    }
    public PersistenceException(String msg, Exception ex){
        super(msg, ex);
    }
    
}
