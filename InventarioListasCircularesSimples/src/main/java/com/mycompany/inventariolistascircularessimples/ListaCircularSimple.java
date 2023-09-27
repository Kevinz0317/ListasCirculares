/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariolistascircularessimples;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ListaCircularSimple {
    private Nodo inicio;
    private Nodo ultimo; 

    public ListaCircularSimple() {
        inicio = null;
        ultimo = null;
    }

    public void insertarAlInicio(Producto pro) {
        Nodo nuevoNodo = new Nodo(pro);
        if (inicio == null) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo; 
            nuevoNodo.siguiente = inicio; 
        } else {
            nuevoNodo.siguiente = inicio; 
            inicio = nuevoNodo; 
            ultimo.siguiente = inicio; 
        }
    }

    public void imprimirLista() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = inicio;
        int i = 0;
        do {
            System.out.println("Producto #" + ++i + " " + actual.producto + ":");
            System.out.println("- Serial: " + actual.producto.getSerial());
            System.out.println("- Nombre: " + actual.producto.getNombre());
            System.out.println("- Categoria: " + actual.producto.getCategoria());
            System.out.println("- Cantidad: " + actual.producto.getCantidad());
            System.out.println("- Fecha: " + actual.producto.getFecha());
            System.out.println("- Almacen: " + actual.producto.getAlmacen());
            System.out.println("");
            actual = actual.siguiente;
        } while (actual != inicio);
        System.out.println();
    }
    
    public void buscarProducto(int buscar) {
    if (inicio == null) {
        System.out.println("La lista está vacía.");
        return;
    }
    Nodo actual = inicio;
    boolean encontrado = false;
    do {
        int serial = actual.producto.getSerial();
        if (serial == buscar) {
            System.out.println("Producto: " + actual.producto.getSerial() + ":");
            System.out.println("- Nombre: " + actual.producto.getNombre());
            System.out.println("- Categoria: " + actual.producto.getCategoria());
            System.out.println("- Cantidad: " + actual.producto.getCantidad());
            System.out.println("- Fecha: " + actual.producto.getFecha());
            System.out.println("- Almacen: " + actual.producto.getAlmacen());
            System.out.println("");
            encontrado = true;
        }
        actual = actual.siguiente;
    } while (actual != inicio && !encontrado);
    if (!encontrado) {
        System.out.println("[ El producto solicitado no se encuentra en el inventario ]");
    }
    System.out.println();
}

    public void editarProducto(int buscar) {
        Nodo actual = inicio;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        do{
          int serial = actual.producto.getSerial();
            if (serial == buscar) {
                System.out.println("Actualizar datos del Producto " + buscar + ":");
                System.out.println("- Nombre: ");
                String nombre = sc.next();
                actual.producto.setNombre(nombre);
                System.out.println("- Categoria: ");
                String categoria = sc.next();
                actual.producto.setCategoria(categoria);
                System.out.println("- Cantidad: ");
                int cantidad = sc.nextInt();
                actual.producto.setCantidad(cantidad);
                System.out.println("- Fecha: ");
                String fecha = sc.next();
                actual.producto.setFecha(fecha);
                System.out.println("- Almacen: ");
                String almacen = sc.next();
                actual.producto.setAlmacen(almacen);
                System.out.println("[ Producto actualizado exitosamente ]");
                System.out.println("");
                encontrado = true;
                //break;
            } 
            actual = actual.siguiente;  
        }while (actual != inicio && !encontrado);
        if(!encontrado) System.out.println("[ El producto solicitado no se encuentra en el inventario ]");
        System.out.println();
    }

    public void eliminarProducto(int buscar) {
        Nodo actual = inicio;
        Nodo anterior = null;
        boolean encontrado = false;
        while (actual != null) {
            int serial = actual.producto.getSerial();
            if (serial == buscar) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                } 
                System.out.println("[ Producto eliminado exitosamente ]");
                System.out.println("");
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        if(!encontrado) System.out.println("[ El producto solicitado no se encuentra en el inventario ]");
        System.out.println();
    }

    public boolean estaVacia() {
        return inicio == null;
    }
    
    
}
