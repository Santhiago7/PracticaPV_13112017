/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author LAB7-PC6-USER
 */
public class TipoMetodos {
    public static void metodoStatic1() {
        System.out.println("Este es un metodo estatico");
    }
    public static void metodoStatic2(int p) {
        System.out.println("El numero ingresado es: " +p);
    }
    public static int metodoStatic3(int p) {
        return p;
    }
    public void suma(int x, int y) {
        int z=x+y;
        System.out.println("La suma es: " +z);
    }
}
