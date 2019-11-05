/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajr.validacoes;

/**
 *
 * @author root
 */
public class Validacoes {

    public static boolean valida() {
        try {
            return false;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
