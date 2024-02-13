package com.mycompany.ed_tarea04;

import com.mycompany.ed_tarea04.eCesta;

public class main {

    public static void main(String[] args) {

        NuevoMetodo();

    }

    public static void NuevoMetodo() {
        eCesta cesta;
        
        cesta = new eCesta("Apellidos del alumno", 100, "dni del alumno", 10);
        
        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);
    }
    

}
