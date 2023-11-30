package modelView;

import javax.swing.JOptionPane;

public class Operaciones {

    public static double sumar(double num1, double num2) {
    return num1 + num2;
}

// Restar
public static double restar(double num1, double num2) {
    return num1 - num2;
}

// Multiplicar
public static double multiplicar(double num1, double num2) {
    return num1 * num2;
}


    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Error: División por cero.");
            return 0.0;
        }
        double division = (double) num1 / num2;
        return Math.round(division * 1000.0) / 1000.0; // Redondea a 3 cifras decimales
    }



    public static double seno(double num1) {
        double seno = num1 ;
        return Math.round(seno * 1000.0) / 1000.0; 
    }

    public static double coseno(double num1) {
        double coseno = num1;
        return Math.round(coseno * 1000.0) / 1000.0; 
    }

    public static double arcseno(double num) {
        if (num < -1 || num > 1) {
            JOptionPane.showMessageDialog(null, "Error: Valor fuera del rango [-1, 1] para arcseno.");
            return 0.0;
        }
        double arcseno = Math.toDegrees(Math.asin(num));
        return Math.round(arcseno * 1000.0) / 1000.0; 
    }

    public static double arcocoseno(double num) {
        if (num < -1 || num > 1) {
            JOptionPane.showMessageDialog(null, "Error: Valor fuera del rango [-1, 1] para arcocoseno.");
            return 0.0;
        }
        double arcocoseno = Math.toDegrees(Math.acos(num));
        return Math.round(arcocoseno * 1000.0) / 1000.0; 
    }

    public static double secante(double num) {
        double coseno = Math.cos(Math.toRadians(num));
        if (coseno == 0) {
            JOptionPane.showMessageDialog(null, "Error: Secante indefinida (coseno = 0).");
            return 0.0;
        }
        double secante = 1 / coseno;
        return Math.round(secante * 1000.0) / 1000.0; 
    }

    public static double cosecante(double num) {
        double seno = Math.sin(Math.toRadians(num));
        if (seno == 0) {
            JOptionPane.showMessageDialog(null, "Error: Cosecante indefinida (seno = 0).");
            return 0.0;
        }
        double cosecante = 1 / seno;
        return Math.round(cosecante * 1000.0) / 1000.0; 
    }
}
