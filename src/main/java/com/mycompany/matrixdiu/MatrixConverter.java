/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrixdiu;

/**
 * @author Alejandro García Sosa
 */

public class MatrixConverter {
    
    public static String getIntervalMatrix(Matrix matrix, int treshold){
        String res = "";
        int[][] m = matrix.getMatrix();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if (m[i][j] > treshold){
                    res += m[i][j]+", ";
                }else{
                    res += "-, ";
                }
            }
            res += "\n";
        }
        return res;
    }
    
}
