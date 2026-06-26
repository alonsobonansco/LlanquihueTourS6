package ui;

import data.GestorServicios;
import model.ExcursionCultural;
import model.PaseoLacustre;

public class Main {
    public static void main(String[] args) {

        GestorServicios gestorServicios = new GestorServicios();
        gestorServicios.crearTours();
        System.out.println(gestorServicios.mostrarTours());
    }
}