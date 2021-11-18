package reto5;

import utils.ConnectionDB;
import vistas.IngresoVista;

public class Reto5 {

    public static void main(String[] args) {
        // conexion
        ConnectionDB.getConnection();
        // abrir pantalla de usuario
        IngresoVista pantalla_usuario = new IngresoVista();
        pantalla_usuario.setVisible(true);
    }
}