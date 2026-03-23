package ProgramasJava.PracticasPropias;

/*

Programa 2

calcule una serie numerica utilizando calcular n 
contar numeros que cumpen la condicion 
capturar n
sumar numros singun reglas
mostrar resulltados
salir

Calcular una serie numerica pedir a n y sumar los numeros segun las reglas mostrar resultados 
salir 

 Serie del 1 hasta n si el numero es multiplo de 3 sumar su doble
es multiplo de 5 sumar su triple 
 no cumple ninguna sumar el numero normal

*/
import javax.swing.JOptionPane;

public class examen3 {

    public static void main(String[] args) {

        iniciar();

    }

    public static void opcion1(){
       int n = solicitarnumero();
       contar(n);
    }

    public static void iniciar(){

     Menu();

    }



    public static void Menu() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
            " === MENU ======="+
            "\n1 Calculr"+
            "\n2 Salir " + 
            "\nElige una opcion"));

                    switch (opcion) {
                case 1:


                    opcion1();


                    break;

                case 2:


                    JOptionPane.showMessageDialog(null, "Slio");

                    break;

                default:
                    
                    JOptionPane.showMessageDialog(null, "solo una opion entre 1 y 2 ");
            }

        } while (opcion != 2);
    }

    public static int solicitarnumero() {
        
        int n;
        do {

            n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        } while (n == 0);

        return n;
    }

    public static void contar(int n) {
        int suma=0 ,con3=0 , con5 =0;

        for (int i = 1; i <= n; i++) {

            if (i %3==0) {

                suma+=  i*2;

                con3++;


            } 
                 else if (i % 5 == 0) {
                suma +=   i*3;

                con5++;
            } 
            else {
                suma += i;
            }
        }

        Resultados(n, suma, con3, con5);
    }

    public static void Resultados(int n, int suma, int con3, int con5) {

        JOptionPane.showMessageDialog(null,

                "el numero fue: " + n +
                "\n total " + suma +
                "\n muliplos de 3: " + con3 +
                "\n multiplos de 5: " + con5 );
    }



}