/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.excepciones;

/**
 *
 * @author Acer
 */
public class MesIncorrectoException extends Exception {

    /**
     * Creates a new instance of <code>MesIncorrectoException</code> without
     * detail message.
     */
    public MesIncorrectoException() {
    }

    /**
     * Constructs an instance of <code>MesIncorrectoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MesIncorrectoException(String msg) {
        super(msg);
    }
}
