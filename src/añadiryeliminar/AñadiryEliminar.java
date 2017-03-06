package añadiryeliminar;

import java.util.Scanner;
public class AñadiryEliminar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        int eliminar, tam, seleccion;
        
        System.out.print("Ingrese tamaño del vector: ");
        tam = leer.nextInt();
        
        for(int i=0; i<tam ;i++){
            System.out.print("Ingrese el "+(i+1)+" elemento del vector: ");
            vector[i] = leer.nextInt();
        }
        System.out.println(" ");
        System.out.println("Elja la opcion deseada: ");
        System.out.println(" *******************************************");
        System.out.println(" *    1. Eliminar un elemento del vector.  *");
        System.out.println(" *    2. Agregar un elemento al vector.    *");
        System.out.println(" *    3. Multiplicar por un escalar.       *");
        System.out.println(" *    4. Salir.                            *");
        System.out.println(" *******************************************");
        seleccion = leer.nextInt();
        
        
        switch(seleccion){
            case(1):
                System.out.print("Ingrese elemento a eliminar: ");
                eliminar = leer.nextInt();
                
                for(int i=0 ; i<tam ;i++){
                    if(eliminar == vector[i]){
                        for(int j=i ;j<tam ;j++){
                            vector[j] = vector[j+1];
                        }
                        tam = tam-1;
                    }
                }
                
                System.out.println("Vector resultante: ");
                for(int i=0; i<tam ;i++){
                    System.out.print(vector[i]+" ");
                }
                
                break;
                
            case(2):
                System.out.print("Ingrese elemento a agregar: ");
                int agregar = leer.nextInt();
                
                vector[tam] = agregar;
                tam = tam+1;
                for(int i=0 ;i<tam ;i++){
                    for(int j=0; j<tam ; j++){
                        if(vector[i]<vector[j]){
                            int tmp = vector[i];
                            vector[i] = vector[j];
                            vector[j] = tmp;
                        }
                    }
                }
                
                System.out.println("Vector resultante: ");
                for(int i=0; i<tam ;i++){
                    System.out.print(vector[i]+" ");
                }
                
                break;
                
            case(3):
                System.out.print("Ingrese el numero por el cual desea multiplicar: ");
                int mp = leer.nextInt();
                for(int i=0 ;i<tam ;i++){
                    vector[i] *= mp;
                }
                System.out.println("Matriz resultante:");
                for(int i=0 ;i<tam ;i++){
                    System.out.print(vector[i]+" ");
                }
                
                break;
            case(4):
                System.out.println("Adios.");
                break;
        }
        
    }
    
}
