package Animales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar el nombre de su perro: ");
        String nombre=sc.nextLine();
        System.out.println("Ingresar la edad de la mascota: ");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar el nombre de su gato: ");
        String nombre1=sc.nextLine();
        System.out.println("Ingresar la edad de la mascota: ");
        int edad1=sc.nextInt();
        sc.nextLine();
        Gato mascota1= new Gato(nombre1,edad1);
        Perro mascota2=new Perro(nombre,edad);
        mascota1.hacerSonido();
        mascota2.hacerSonido();
    }
}
