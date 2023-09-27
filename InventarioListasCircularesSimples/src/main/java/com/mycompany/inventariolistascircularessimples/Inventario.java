/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inventariolistascircularessimples;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Inventario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();
        ListaCircularSimple lista = new ListaCircularSimple();
        Producto producto1 = new Producto(101, 50, "Camiseta", "Ropa", "2023-08-29", "Almacén A");
        lista.insertarAlInicio(producto1);
        Producto producto2 = new Producto(202, 25, "Zapatos deportivos", "Calzado", "2023-08-30", "Almacén B");
        lista.insertarAlInicio(producto2);
        Producto producto3 = new Producto(303, 10, "Laptop", "Electrónica", "2023-08-31", "Almacén C");
        lista.insertarAlInicio(producto3);
        Producto producto4 = new Producto(404, 100, "Libro de cocina", "Libros", "2023-09-01", "Almacén D");
        lista.insertarAlInicio(producto4);
        Producto producto5 = new Producto(505, 75, "Juguete de peluche", "Juguetes", "2023-09-02", "Almacén E");
        lista.insertarAlInicio(producto5);
        System.out.println(" ===== [ INVENTARIO ] =====");
        while (true) {
            System.out.println("Opciones: ");
            System.out.println("1. Agregar producto ");
            System.out.println("2. Leer inventario ");
            System.out.println("3. Buscar producto ");
            System.out.println("4. Editar producto ");
            System.out.println("5. Eliminar producto ");
            System.out.println("0. Salir ");
            System.out.print("¿Qué dese hacer? : ");
            int op = sc.nextInt();
            System.out.println("");
            if (op == 1) {
                Producto temp = producto.crearProducto();
                lista.insertarAlInicio(temp);
                System.out.println("[ Producto agregado exitosamente ]");
            } else if (op == 2) {
                lista.imprimirLista();
            } else if (op == 3) {
                System.out.print("Ingrese el serial del producto: ");
                int buscar = sc.nextInt();
                lista.buscarProducto(buscar);
            } else if (op == 4) {
                System.out.print("Ingrese el serial del producto: ");
                int buscar = sc.nextInt();
                lista.editarProducto(buscar);
            } else if (op == 5) {
                System.out.print("Ingrese el serial del producto: ");
                int buscar = sc.nextInt();
                lista.eliminarProducto(buscar);
            } else if (op == 0) {
                System.out.println("[ Saliendo del programa ]");
                break;
            } else {
                System.out.println("[ Valor incorrecto ]");
            }
        }
    }
}
