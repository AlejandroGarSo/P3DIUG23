/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrixdiu;

import java.util.Arrays;

/**
 * @author Alejandro García Sosa
 */

public class Matrix {
    
    private int[][] matrix;
    private int min, max;
    
    public Matrix(int min, int max){
        matrix = new int[10][10];
        this.min = min;
        this.max = max;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int)(Math.random() * (this.max + 1 - this.min) + this.min);
            }
        }
    }
    
    public int[][] getMatrix(){
        return matrix;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getMax(){
        return max;
    }
    
    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < 10; i++){
            res += Arrays.toString(matrix[i])+"\n";
        }
        return res;
    }
}
