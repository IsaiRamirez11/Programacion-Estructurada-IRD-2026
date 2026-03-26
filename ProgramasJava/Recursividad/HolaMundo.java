package ProgramasJava.Recursividad;

public class HolaMundo {
    public static void main(String[] args) {
    numeroD(5);
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

public static void numeroA(int n){
 if (n==0){
    return;
}
else{
    System.out.println(n);
    numeroA(n-1);
}   
}

public static void numeroD(int n){
 if (n==5){
    return;
}
else{
    System.out.println(n);
    numeroD(n+1);
}   
}

}
