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
public class DatoVacioException extends Exception {

    /**
     * Creates a new instance of <code>DatoIncorrectoException</code> without
     * detail message.
     */
    public DatoVacioException() {
    }

    /**
     * Constructs an instance of <code>DatoIncorrectoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DatoVacioException(String msg) {
        super(msg);
    }
}
