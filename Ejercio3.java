public class Main {
    public static void main(String args[]) {
      
      System.out.println(suma(10,30,50));
      
      Coche c1 = new Coche();
      c1.agregarPuertas();
      System.out.println(c1.puertas);
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
