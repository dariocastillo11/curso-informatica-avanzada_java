
import javax.swing.JOptionPane;
import java.util.Scanner;

//ARREGLOS
public class Main {
    public static void main(String[] args) {
/*
        Scanner entrada=new Scanner(System.in);
        int nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite al cantidad de numeros del arreglo"));
        char[] letras= new char[nElementos];
        System.out.println("Digite los elementos del arreglo: ");
        for( int i=0; i<nElementos; i++){
            System.out.println((i+1)+" .digite un caracter:");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("los caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++){
            System.out.println(letras[i]+" ");
        }
*/

        String[]nombres = {"dario", "sofia", "gaby", "abel", "dani", "bachi"};
       /* for(int i=0; i< nombres.length; i++){ //nombre.length si no conozco el tamaño del arreglo
            System.out.println(nombres[i]);
        }*/
        //for each
        for(String i: nombres){
            System.out.println("Nombre: "+i);
        }


    }
}