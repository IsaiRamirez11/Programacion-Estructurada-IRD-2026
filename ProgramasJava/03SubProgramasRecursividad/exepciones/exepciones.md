

# EXCEPCIONES EN JAVA 

## 1.QUE ES UNA EXCEPCION?????'
>una excepcion es un error que ocurre durante la ejecucion del programa y que interrumpe el flujo normal 

** Ejemplos Comunes 
- Dividir entre 0
- Convertir "Hola" a número
- Acceder a una posicion inexistente de un arreglo

## ESTRUCTURA BÁSICA

```java
try{
    //codigo que puede generar error
}catch(TipoDeException e){
    //codigo que maneja 
}finally{
    //opcional: siempre se ejecuta
}
```
## TIPOS DE EXCEPCIONES
- Checked (obligatorias)
    1. IOException
    2. SQLException

- UnChecked (RuntimeException)
    no es obligatorio manjarlas, ejemplos:
    1. ArithmeticsException
    2. NullPointerException
    3. NumberFormatException

## EJEMPLOS: DIVISION ENTRE CERO
```java
import javax.swing.*;

public class DivisionCeroException {
    public static void main(String[] args){
        int n1,n2,r;
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2: "));
            r = n1 / n2;

            System.out.println("El valor es: " + r);
        } catch (RuntimeException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
```