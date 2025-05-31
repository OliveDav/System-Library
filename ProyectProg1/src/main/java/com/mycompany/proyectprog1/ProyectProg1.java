package com.mycompany.proyectprog1;

import java.util.ArrayList;

public class ProyectProg1 {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libros> libros = new ArrayList<>();
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    public static ArrayList<LibrosVentas> librosventas = new ArrayList<>();
    public static ArrayList<Factura> facturas = new ArrayList<>();
    public static ArrayList<Proveedores> proveedores = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Login l = new Login();
        l.setVisible(true);
        Usuario u = new Usuario();
        u.nombre = "oliver";
        u.password = "1";
        u.rol = "V";
        u.usuario = "oliver";
        ProyectProg1.usuarios.add(u);
        
    }
}
