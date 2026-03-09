/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

public class Metodos {

static double calcularNotas(double nota1, double nota2, double nota3){
     double prom;
     prom=(nota1+nota2+nota3)/3;
    return prom;
}
    public static void main(String[] args) {
        double nota1=18.5;
        double nota2=19.5;
        double nota3=15;
        double prom;
        prom=calcularNotas(nota1, nota2,nota3);
        System.out.println("El Promedio de sus notas es: "+prom);
    }
}
