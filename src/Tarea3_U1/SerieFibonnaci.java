package Tarea3_U1;

import java.util.Scanner;

public class SerieFibonnaci {

	public static void main(String[] args) {
		//Declaracion y asignacion de variables

        int Variable1= 0, Variable2=1, Variable3=0, Cantidad=0;
        //Variable para leer datos en consola
        Scanner leer =  new Scanner(System.in);
        System.out.println("Cantidad maxima de numeros en la serie:");
        Cantidad = leer.nextInt();
        //Imprimir los primeros dos valores
        System.out.println("\n"+Variable1 +"\n"+ Variable2);

        //Ciclo solicitado
        int i=1;
        while(i<=Cantidad){
          Variable3= Variable1 + Variable2;
          System.out.println(Variable3);
          Variable1 =   Variable2;
          Variable2 = Variable3;
          i++;
        }

        System.out.println("FIN");
	}

}
