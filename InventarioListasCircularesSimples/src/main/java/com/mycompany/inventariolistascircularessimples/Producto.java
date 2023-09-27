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
public class Producto {
    
    private int serial;
    private int cantidad;
    private String nombre;
    private String categoria;
    private String fecha;
    private String almacen;

    public Producto() {
    }

    public Producto(int serial, int cantidad, String nombre, String categoria, String fecha, String almacen) {
        this.serial = serial;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fecha = fecha;
        this.almacen = almacen;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public Producto crearProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Serial: ");
        int serial = sc.nextInt();
        System.out.print("- Nombre: ");
        String nombre = sc.next();
        System.out.print("- Categoria: ");
        String categoria = sc.next();
        System.out.print("- Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("- Fecha: ");
        String fecha = sc.next();
        System.out.print("- Almacen: ");
        String almacen = sc.next();
        System.out.println("");
        Producto producto = new Producto(serial, cantidad, nombre, categoria, fecha, almacen);
        return producto;
    }

}
