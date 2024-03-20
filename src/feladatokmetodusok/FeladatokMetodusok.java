/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feladatokmetodusok;

import java.util.Random;


public class FeladatokMetodusok {

    static Random rnd = new Random();
    public static void main(String[] args) {
        matrixOsszeadasa();
    }

    private static void matrixOsszeadasa() {
        int [][] matrixA = feltolt(3,2);
        matrixKiir("\'A\' mátrix:", matrixA);
        int [][] matrixB = feltolt(3,2);
        matrixKiir("\'B\' mátrix:", matrixB);
        
        int [][] matrixC = osszeadas(matrixA,matrixB);
        matrixKiir("\'A\' + \'B\' mátrix:", matrixC);
    }

    private static int[][] feltolt(int sor, int oszlop) {
        int[][] matrix = new int[sor][oszlop];
        int also = -15, felso = 25;
        int db = felso - also + 1;
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++){
                matrix[i][j] = (int)(Math.random()*db)+ also;
            }
                
        }
        return matrix;
    }

    private static void matrixKiir(String cim, int[][] matrix) {
        int sor = matrix.length;
        System.out.println(cim);
        for (int i = 0; i < sor; i++) {
            int oszlop = matrix[i].length;
            for (int j = 0; j < oszlop; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static int[][] osszeadas(int[][] matrixA, int[][] matrixB) {
        int sor = matrixA.length;
        int oszlop = matrixA[0].length;
        int [][] matrix = new int[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++){
                matrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrix;
        
        
    }
    
}
