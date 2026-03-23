package ProgramasJava.Recursividad;

public class HolaMundo {
    public static void main(String[] args) {
    imprimir(5);
}
public static void imprimir(int n){
    //Caso base

if (n==1){
    return;
}
else{
    System.out.println("Hola mundo");
    imprimir(n-1);
}

}
}
