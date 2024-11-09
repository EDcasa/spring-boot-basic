package com.davidcasa.archhex.exceptions;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Slf4j
public class CheckedExceptions {

    /**
     * Esta es una excepcion CHECKED debido a que nos obliga a
     * controlar la excepcion y si no lo hacemos marca error
     * Existen 2 maneras de capturar la excepcion con throws
     * o con try ... catch
     */
    public void handleCheckedExceptionthrows() throws FileNotFoundException {
        new FileInputStream(new File("."));
    }

    public void handleCheckedExceptionTC() {
        try{
            new FileInputStream(new File("."));
        } catch (FileNotFoundException e){
            log.info(e.getMessage());
        }
    }
}
