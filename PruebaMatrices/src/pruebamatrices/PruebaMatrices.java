package pruebamatrices;

import java.awt.SystemColor;
import java.util.Scanner;

public class PruebaMatrices {

    public static void main(String[] args) {
        menu();
//        int[][] matriz = new int[3][3];
//        
//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[0][2] = 3;
//        matriz[1][0] = 4;
//        matriz[1][1] = 5;
//        matriz[1][2] = 6;
//        matriz[2][0] = 7;
//        matriz[2][1] = 8;
//        matriz[2][2] = 9;
//        
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[j][i] + "\t");
//            }
//            System.out.println("\n");
//        }
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dimesion");
        int dimension = teclado.nextInt();
        Matriz m = new Matriz(dimension);
        boolean salir = false;
        while (!salir) {

            
            System.out.println(desplegarOpMnu());
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    m.mostrarMatriz();
                    break;
                case 2:
                    m.rotarSentidoHorario();
                    break;
                case 3:
                    m.rotarAntiSentidoHorario();
                    break;
                case 4:
                    m.invertirMatrizHorizontal();
                    break;
                case 5:
                    m.invertirMatrizVertical();
                    break;
                default:
                    salir = true;
                    break;
            }
        }

    }

    private static String desplegarOpMnu() {
        String opMenu = "";
        opMenu += "1. Mostrar Matriz\n";
        opMenu += "2. Rotar Matriz en sentido horario\n";
        opMenu += "3. Rotar matriz en contra del sentido horario\n";
        opMenu += "4. Invertir matriz de manera horizontal\n";
        opMenu += "5. invertir matriz de manera vertical\n";
        opMenu += "otro. Salir";
        return opMenu;
    }
}
