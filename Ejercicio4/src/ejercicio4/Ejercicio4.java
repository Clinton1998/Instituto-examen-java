
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        do{
            
            System.out.print("Ingresa un numero: ");
            numero = entrada.nextInt();
            if(numero==0)continue;
            if(numero%2==0){
                System.out.println("ES PAR");
            }else{
                System.out.println("ES IMPAR");
            }
            
        }while(numero!=0);
    }
    
}
