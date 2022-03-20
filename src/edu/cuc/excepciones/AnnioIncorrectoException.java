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
public class AnnioIncorrectoException extends Exception {

    /**
     * Creates a new instance of <code>AnnioIncorrectoException</code> without
     * detail message.
     */
    public AnnioIncorrectoException() {
    }

    /**
     * Constructs an instance of <code>AnnioIncorrectoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AnnioIncorrectoException(String msg) {
        super(msg);
    }
}
