/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones;

/**
 *
 * @author L&J
 */
public class BrokenBarrierExceptionEj {
public static void main(String[] args) {
        try {
            // Simulación de algún código que pueda lanzar la excepción respectiva
            throw new Exception("¡Error de BrokenBarrier!");
        } catch (Exception e) {
            System.err.println("Se ha producido un error de BrokenBarrier: " + e.getMessage());
        }
    }
}
