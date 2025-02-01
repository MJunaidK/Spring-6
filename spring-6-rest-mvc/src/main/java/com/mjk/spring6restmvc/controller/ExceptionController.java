/**
 * Created by Junaid on 1/21/2025
 */
package com.mjk.spring6restmvc.controller;

import org.springframework.http.ResponseEntity;

//@ControllerAdvice // this will be picked globally
public class ExceptionController {

  //  @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(){

        System.out.println("In global exception handler");

        return ResponseEntity.notFound().build();
    }
}
