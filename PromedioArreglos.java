import javax.swing.JOptionPane;

public class PromedioArreglos {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
     double [] vector = new double[solicitarNumcalif()];


    }
    public static int solicitarNumcalif (){
        int numCalif =0;
        while (true) {
            
        
        try {
         numCalif = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de calificaciones"));
         if(numCalif>0 && numCalif<=10){
            return numCalif;
         }
         JOptionPane.showMessageDialog(null, "El numero de caificaciones debe ser positivo y solo hata 10 calif");

                            }catch(NumberFormatException ex){
                              JOptionPane.showMessageDialog(null, "El numero e calificaciones debe ser un entero");

        }
     }
  }


  public static double solicitarCalif (){
        double calif =0;
        while (true) {
            
        
        try {
         calif= Double.parseDouble (JOptionPane.showInputDialog("Ingresa las calificacion"));
         if(calif>0.0 && calif<=10.0){
            return calif;
         }
         JOptionPane.showMessageDialog(null, "El numero de caificaciones debe ser positivo y solo hata 10 calif");

                            }catch(NumberFormatException ex){
                              JOptionPane.showMessageDialog(null, "solo numeros");

        }
     }
  }

  public static void almacenarcalif(double arr []){
    for (int i = 0; i < arr.length; i++) {
        arr[i]=solicitarCalif(); 
    }
  }

  public static double calcularPromedio(double arr[]){
    int i=0;
    double prom= 0.0;
    while (i<arr.length) {
    prom+=arr[i];
    i++;    
    }
    return prom/arr.length;
  }

  public static int NumeroDeMayoresAlPromedio(double arr[]){
    double prom = calcularPromedio(arr);
    int numMayor=0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>prom){
        numMayor++;
      }  
    }
    return numMayor; 

  }

    public static double ValoresDeMayoresAlPromedio(double arr[]){
    double prom = calcularPromedio(arr);
    double vector [] = new double[NumeroDeMayoresAlPromedio(arr)];
    int j=0;

    int numMayor=0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>prom){
        vector[j]=arr[i];
        j++;
      }  
    }
    return numMayor; 

  }

  public static void imprimir(double [] arr){
     String salida= "Promedio:"
  }




}

