package eXA;


import java.util.Scanner;


public class TEST {


    public static void main(String[] args) {
     
   
         Scanner lector=new Scanner(System.in);

        
      System.out.println("Hola, Bienvenido al Ahorcado");
            
       String palabra1="bengi";
      String[] arreglo=new String[50];
      int cont=0;
      int cont2=0;
      String letra;
     
      
      
      for(int i=0;i<palabra1.length();i++){
   arreglo[i]=String.valueOf(palabra1.charAt(i));
   
    }
 
       Scanner lector2=new Scanner(System.in);
    while(cont!=palabra1.length()){
    
      System.out.print("ingrese la letra:");
         letra=lector2.next();

           if(arreglo[cont].equals(letra)){
           System.out.println("letra correcta");
           cont++;
           if(cont==palabra1.length()){
           
           System.out.println("¡¡¡FELICIDADES HAS GANADO EL  NIVEL!!!");
           System.out.println ("Bienvenido al segundo nivel");
               String palabra2="disney";
      String[] arreglo2=new String[50];
      int cont4=0;
      int cont5=0;
      String letra2;
     
      
      
      for(int i=0;i<palabra2.length();i++){
   arreglo2[i]=String.valueOf(palabra2.charAt(i));
   
    }
 
       Scanner lector4=new Scanner (System.in);
    while(cont4!=palabra2.length()){

						System.out.println("ingrese la letra:");
						letra2 = lector2.next();

           if(arreglo2[cont4].equals(letra2)){
           System.out.println("letra correcta");
           cont4++;
           if(cont4==palabra2.length()){
           
           System.out.println("¡¡¡FELICIDADES HAS GANADO EL ULTIMO NIVEL!!!");
           }
           }
           else {
               System.out.println("letra incorrecta");
               cont5++;
               if(cont5==6){
               System.out.println("cantidad de fallos agotada");
               break;
               }
           }
    }
           }
           }
           else {
               System.out.println("letra incorrecta");
               cont2++;
               if(cont2==6){
               System.out.println("Fallos Agotados, Perdistes!");
               break;
               }
           }
    }
        }
      
      
    }
    
      
    
      
    

