package Carrera;

import javax.swing.*;

public class Carrera {
    private Coche participante1;
    private Coche participante2;
    private Coche Ganador;
    private double kmTotales;
    private int numeroVueltas;

    public Carrera() {
    }

    public Carrera(Coche participante1, Coche participante2, double kmTotales, int numeroVueltas) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;

    }
    public void iniciarCarrera(Coche participante1, Coche participante2){

            System.out.println(" 🚦 ▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F VUELTAS ▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F 🚦 ");
            for (int vuelta = 1; vuelta <numeroVueltas ; vuelta++) {
                System.out.print("\n◄◄Vuelta►► "+vuelta+":");
                int velocidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad del Coche 1 (km/h):"));
                participante1.Acelerar(velocidad);
                int velocidad2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad del Coche 2 (km/h):"));
                participante2.Acelerar(velocidad2);

                System.out.println();
                System.out.println("El participante 1 🚗\uD83D\uDCA8 con matrícula " + participante1.getMatricula() + " ha acelerado a " +participante1.getVelocidad() + " km/h. Total recorrido: " + participante1.getKmRecorridos()+ " km.");
                System.out.println("El participante 2 🚙\uD83D\uDCA8 con matrícula " + participante2.getMatricula() + " ha acelerado a " +participante2.getVelocidad() + " km/h. Total recorrido: " + participante2.getKmRecorridos()+ " km.");
                if (participante1.getKmRecorridos() >= kmTotales || participante2.getKmRecorridos() >= kmTotales){
                    Ganador();
                    break;
                }
            }

             int vueltasExtra = 0;
           while ( participante1.getKmRecorridos() < kmTotales && participante2.getKmRecorridos() < kmTotales) {
               vueltasExtra++;
               System.out.println();
               System.out.println("▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F VUELTA EXTRA "+vueltasExtra+" ▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F▪\uFE0F");
               int velocidadExtra = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad del Coche 1 (km/h):"));
               participante1.Acelerar(velocidadExtra);
               int velocidadExtra2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad del Coche 2 (km/h):"));
               participante2.Acelerar(velocidadExtra2);
               System.out.println();
               System.out.println("El participante 1 🚗\uD83D\uDCA8 con matrícula " + participante1.getMatricula() + " ha acelerado a " + participante1.getVelocidad() + " km/h. Total recorrido: " + participante1.getKmRecorridos() + " km.");
               System.out.println("El participante 2 🚙\uD83D\uDCA8 con matrícula " + participante2.getMatricula() + " ha acelerado a " + participante2.getVelocidad() + " km/h. Total recorrido: " + participante2.getKmRecorridos() + " km.");

               if (participante1.getKmRecorridos() > kmTotales || participante2.getKmRecorridos() > kmTotales) {
                   Ganador();
                   break;
               }
           }

        System.out.println();
        System.out.println();
        System.out.println("◼\uFE0F◼\uFE0F◼\uFE0F◼\uFE0F◼\uFE0FLA CARRERA HA CONCLUIDO🏁🏁◼\uFE0F◼\uFE0F◼\uFE0F◼\uFE0F◼\uFE0F");

    }
    public void Ganador(){
        if (participante1.getKmRecorridos() > kmTotales || participante2.getKmRecorridos() > kmTotales)
        if (participante1.getKmRecorridos() > participante2.getKmRecorridos()){
            Ganador = participante1;
            System.out.print("\nEl ganador es el participante 1 🚗, con matricula "+Ganador.getMatricula()+" y recorrio "+Ganador.getKmRecorridos()+" km.\uD83E\uDD47\uD83C\uDFC6");


        } else if (participante2.getKmRecorridos() > participante1.getKmRecorridos()){
            Ganador = participante2;
            System.out.print("\nEl ganador es el paticipante numero 2 🚙, con matricula "+Ganador.getMatricula()+" y recorrio "+Ganador.getKmRecorridos()+" km.\uD83E\uDD47\uD83C\uDFC6");

        }else {
            System.out.println("La carrera ha terminado en empate.. 🚗🚙");
        }


    }

    public double getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(double kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
}
