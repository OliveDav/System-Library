package com.mycompany.proyectprog1;

import java.util.ArrayList;

public class ProyectProg1 {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libros> libros = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Login l = new Login();
        l.setVisible(true);
        
    }
}
