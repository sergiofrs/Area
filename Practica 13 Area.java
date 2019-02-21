/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Alejandro
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int opcion=0, opcion2=0;
        double figura, valor1, valor2;
        do
        {
            opcion= Integer.parseInt(JOptionPane.showInputDialog
                    ("Menu \n" +
                     "¿Que desea calcular? \n"+
                    "1) Areas \n" +
                    "2) Volumen \n" +
                    "3) Salir"));
            switch(opcion)
            {
                case 1:
                    opcion= Integer.parseInt(JOptionPane.showInputDialog
                    ("Menu Area \n" +
                    "1) Circulo \n" +
                    "2) Triangulo \n" +
                    "3) Rectangulo \n" +
                    "4) Pentagono \n" +        
                    "5) Salir"));
                    switch(opcion)
                    {
                        case 1:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor del radio: "));
                            figura= (valor1*valor1)*3.1416;
                    JOptionPane.showMessageDialog(null, "El area del circulo es: " +figura);
                    break;
                        case 2:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la base: "));
                    valor2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la altura: "));
                            figura= (valor1*valor2)/2;
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " +figura);
                    break;
                        case 3:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la base: "));
                    valor2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la altura: "));
                            figura= valor1*valor2;
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es: " +figura);
                    break;
                     case 4:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor del perimetro: "));
                    valor2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la apotema: "));
                            figura= valor1*valor2/2;
                    JOptionPane.showMessageDialog(null, "El area del Pentagono es: " +figura);
                    break;         
                    }
                    System.exit(0); 
                       
                case 2:
                    opcion= Integer.parseInt(JOptionPane.showInputDialog
                    ("Areas \n" +
                    "1) Piramide \n" +
                    "2) Cilindro \n" +
                    
                    "3) Salir"));
                    switch(opcion)
                    {
                        case 1:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el area de la base: "));
                    valor2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la altura: "));
                            figura= valor1*valor2/3;
                    JOptionPane.showMessageDialog(null, "El volumen de la piramide es: " +figura);
                    break;
                        case 2:
                    valor1=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la base: "));
                    valor2=Double.parseDouble(JOptionPane.showInputDialog
                            ("Ingresa el valor de la altura: "));
                            figura= 3.1416*(valor1*valor1)*valor2;
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " +figura);
                    break;
                       
                    }
                    System.exit(0); 
            }
        }
        while(opcion!=4);
        while(opcion!=3);
    }
}
