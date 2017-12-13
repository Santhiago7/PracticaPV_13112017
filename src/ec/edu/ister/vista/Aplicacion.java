/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Persona;
import ec.edu.ister.modelo.TipoMetodos;
import static ec.edu.ister.modelo.TipoMetodos.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

/**
 *
 * @author LAB7-PC6-USER
 */
public class Aplicacion {
    public static void main(String[] args) {
        //TipoMetodos.metodoStatic1();
        //TipoMetodos.metodoStatic2(5);
        //System.out.println(metodoStatic3(8));
        //showMessageDialog(null, pow(2,3));
        //TipoMetodos tp = new TipoMetodos();
        //tp.suma(6, 7);
        Persona p= new Persona();
        p.setCedula("123456789");
        showMessageDialog(null, p.getCedula());
    }
}
