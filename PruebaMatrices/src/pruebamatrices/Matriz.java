package pruebamatrices;

import java.util.Random;

public class Matriz {
    
    private int ladoMatrizCuadrada;
    private int[][] matrizLLena;
    
    public Matriz(int ladoMatrizCuadrada){
        this.ladoMatrizCuadrada = ladoMatrizCuadrada;
        this.matrizLLena = llenarMatriz();
    }
    
    private int[][] llenarMatriz(){
        Random r = new Random();
        int[][] matrizALlenar = new int[this.ladoMatrizCuadrada][this.ladoMatrizCuadrada];
        for (int i = 0; i < matrizALlenar.length; i++) {
            for (int j = 0; j < matrizALlenar[i].length; j++) {
                int numeroAUbicar = r.nextInt(10)+1;
                matrizALlenar[i][j] = numeroAUbicar;
            }
        }
        return matrizALlenar;
    }
    
    public void mostrarMatriz(){
        for (int i = 0; i < this.matrizLLena.length; i++) {
            for (int j = 0; j < this.matrizLLena[i].length; j++) {
                System.out.print(this.matrizLLena[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    
    public void rotarSentidoHorario(){
        int[][] matrizRotada = new int[this.ladoMatrizCuadrada][this.ladoMatrizCuadrada];
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                //matrizRotada[j][this.matrizLLena.length - 1 - i] = this.matrizLLena[i][j];
                matrizRotada[i][j] = matrizLLena[matrizLLena.length - 1 - j][i];
            }
        }
        matrizLLena = matrizRotada;
    }
    
    public void rotarAntiSentidoHorario(){
        int[][] matrizRotada = new int[this.ladoMatrizCuadrada][this.ladoMatrizCuadrada];
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada.length; j++) {
                
                //matrizRotada[this.matrizLLena[i].length - 1 - j][i] = this.matrizLLena[i][j];
                matrizRotada[i][j] = matrizLLena[j][matrizLLena.length - 1 - i];
            }
        }
        matrizLLena = matrizRotada;
    }
    
    public void invertirMatrizHorizontal(){
        int[][] matrizInvertida = new int[ladoMatrizCuadrada][ladoMatrizCuadrada];
        
        for (int i = 0; i < matrizLLena.length; i++) {
            for (int j = 0; j < matrizLLena[i].length; j++) {
                matrizInvertida[i][j] = matrizLLena[ladoMatrizCuadrada - 1- i][j];
            }
        }
        this.matrizLLena = matrizInvertida;
    }
    
    public void invertirMatrizVertical(){
        int[][] matrizInvertida = new int[ladoMatrizCuadrada][ladoMatrizCuadrada];
        
        for (int i = 0; i < matrizInvertida.length; i++) {
            for (int j = 0; j < matrizInvertida[i].length; j++) {
                matrizInvertida[j][i] = matrizLLena[j][ladoMatrizCuadrada - 1 - i];
            }
        }
        
        matrizLLena = matrizInvertida;
    }
    

}
