/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariolistascircularessimples;

/**
 *
 * @author kevin
 */
public class Nodo {
    Producto producto;
    Nodo siguiente; // Puntero al siguiente nodo

    public Nodo(Producto pro) {
        this.producto = pro;
        this.siguiente = null;
    }
}