package com.webnet.moviecatalog;

import java.util.Arrays;

public class Main3 {


    public static void main(String[] args) {
        int[][] arr1 = {
                {2, 3, 2},
                {3, 2, 2}
        };

        int[][] arr2 = {
                {2, 3},
                {3, 2},
                {3, 2}
        };
        int [][] result = new int[arr1.length][arr2.length];
      for(int i= 0; i< arr1.length; i++){
          for (int j=0; j<arr2.length; j++){
               int sum = arr1[i][j];
                result[i][j] = arr1[i][j] * arr2[j][i];
          }
      }

        //System.out.println(arr2.length);
        //System.out.println(Arrays.toString(result));


    }




}
