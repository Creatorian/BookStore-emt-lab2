package com.example.emt_lab.model.exceptions;

public class CopiesUnavailable extends RuntimeException{
    public CopiesUnavailable() {

        super("No copies available ");
    }

}
