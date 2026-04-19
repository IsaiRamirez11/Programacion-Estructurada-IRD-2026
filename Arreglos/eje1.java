package Arreglos;

import javax.swing.JOptionPane;

/*
 * Solicitar las calificaciones de n alumnos, guardarlas en un arreglo
 * y obtener el promedio, cuántas son aprobatorias y cuántas reprobatorias.
 */
public class eje1 {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int tam = solicitarTamano();
        int[] calificaciones = new int[tam];
        llenarArreglo(calificaciones);
        imprimirResultados(calificaciones);
    }





    public static int solicitarTamano() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de calificaciones:"));
    }




    public static void llenarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = solicitarValor(i);
        }
    }






    public static int solicitarValor(int posicion) {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación " + (posicion + 1) + ":"));
    }






    public static void imprimirResultados(int[] arr) {
        int suma = 0, aprobados = 0, reprobados = 0;
        
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
            if (arr[i] >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }

         
        }







       double promedio = suma/arr.length;
        System.out.println("Promedio:   " + promedio);
        System.out.println("Aprobados:  " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}