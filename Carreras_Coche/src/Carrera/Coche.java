package Carrera;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private double kmRecorridos;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int cv, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;


    }
    public void Acelerar(int velocidadAcelerar){

       if (cv < 100){
           velocidad += (int) (Math.random()*velocidadAcelerar);
       }else {
           velocidad +=10 + (int)(Math.random()*velocidadAcelerar);
       }
       double incrementoRecorrido=  0.5*velocidad;
       kmRecorridos += incrementoRecorrido;
       velocidad = Math.max(velocidad,10);

    }
    public void mostrarDatos(){

        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matricula: "+matricula);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
        System.out.println("◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾◾");
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public int getCv() {

        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {

        return cc;
    }

    public void setCc(int cc) {

        this.cc = cc;
    }

    public int getVelocidad() {

        return velocidad;
    }

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;
    }

    public double getKmRecorridos() {

        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {

        this.kmRecorridos = kmRecorridos;
    }
}
