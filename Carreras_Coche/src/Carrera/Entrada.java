package Carrera;

import javax.swing.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Volkswagen golf","GTI MK7","1234-JAM",100,1200);
        Coche coche2 = new Coche("Seat leon","MK3","5678-AGB",95,1100);
        System.out.println("Los participantes son:");
        System.out.println("Participante 1 🚗:");
        coche1.mostrarDatos();
        System.out.println("Participante 2 🚙:");
        coche2.mostrarDatos();
        int kmTotales = Integer.parseInt(JOptionPane.showInputDialog("Introduce los kilometros totales de la carrera:"));
        int numeroVueltas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vueltas de la carrera:"));

        Carrera carrera = new Carrera(coche1,coche2,kmTotales,numeroVueltas);
        System.out.println("Los kilometros totales de la carrera son:"+kmTotales);
        System.out.println("Las vuelta de la carrera son: "+numeroVueltas);
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("\uD83C\uDFC1 ¡INICIANDO CARRERA! \uD83C\uDFC1");
        System.out.println();
        carrera.iniciarCarrera(coche1,coche2);


    }
}
