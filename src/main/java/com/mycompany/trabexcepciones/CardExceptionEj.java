/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;
import javax.smartcardio.CardException;

public class CardExceptionEj {
   public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new CardException("¡Error de tarjeta!");
        } catch (CardException e) {
            System.err.println("Se ha producido un error de tarjeta: " + e.getMessage());
        }
    }
}
