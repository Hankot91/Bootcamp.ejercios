public class main {
    public static void main(String args[]) {
   
        //ejercicio con if//
        int numeroIf = 1;
        if(numeroIf > 0){
            System.out.println("El numero es positivo: " + numeroIf);
            
        } else if(numeroIf < 0){
            System.out.println("El numero es negativo: " + numeroIf);
            
        } else {
            System.out.println("El numero es cero");
            
        }
        
        //ejercicio con while//
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
            
        }
        
        //ejercicio con do while//
        int numeroDoWhile = 1;
        do{
            System.out.println("El numero es: " + numeroDoWhile);
            numeroDoWhile++;
            
        }while(numeroDoWhile < 0);
        
        //ejercicio con for//
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero: " + numeroFor);
            
        }
        
        //ejercicio con switch case//
        String estacion = "verano";
        
        switch(estacion){
            case "primavera":
                System.out.println("Es: " + estacion);
                break;
            
            case "verano" :
                System.out.println("Es: " + estacion);
                break;
                
            case "otoño":
                System.out.println("Es: " + estacion);
                break;
            
            case "invierno":
                System.out.println("Es: " + estacion);
                break;
            
            default:
                System.out.println("No es un caracter correcto");
        }
        
    }
}