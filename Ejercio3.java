public class Main {
    public static void main(String args[]) {
      
      System.out.println(suma(10,30,50));
      
      Coche micoche = new Coche();
      micoche.agregarPuertas();
      System.out.println(micoche.puertas);
    }
    
    
    static int suma(int a, int b, int c){
    return a+b+c;
    
    }
    
     
  
}

 class Coche {
        public 
        
        int puertas = 0;

        void agregarPuertas(){
            puertas++;
        }
          
      }
