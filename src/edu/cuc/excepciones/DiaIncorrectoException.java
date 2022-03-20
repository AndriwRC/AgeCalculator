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
public class DiaIncorrectoException extends Exception {

    /**
     * Creates a new instance of <code>DiaIncorrectoException</code> without
     * detail message.
     */
    public DiaIncorrectoException() {
    }

    /**
     * Constructs an instance of <code>DiaIncorrectoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DiaIncorrectoException(String msg) {
        super(msg);
    }
}
