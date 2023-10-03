package com.mycompany.rrhh_hotel;

import com.mycompany.rrhh_hotel.BaseDeDatos;
import java.util.Scanner;

public class Menu {
    private BaseDeDatos baseDeDatos;
    private Scanner scanner;

    public Menu() {
        this.baseDeDatos = new BaseDeDatos();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        // Mostrar opciones del menú y recibir entrada del usuario
        // Ejecutar operaciones en función de la selección del usuario
    }
}
