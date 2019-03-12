package by.bntu.fitr.tnnf.javalabs.lab12;

import java.util.Random;

public class Logic {

    private static  Random random = new Random();
    //1 task A
    public static void initArrayInt(int[][] arr, int min, int max, int size1, int size2)
    {
        for (int i = 0; i < size1; i++)
        {
            for (int j = 0; j < size2; j++)
            {
                arr[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public static void initArrayFloat(float[][] arr, float min, float max, int size1, int size2)
    {
        for (int i = 0; i < size1; i++)
        {
            for (int j = 0; j < size2; j++)
            {
                arr[i][j] = Math.round((random.nextFloat()* (max - min)+min ) * 100.0f)/100.0f;;
            }
        }
    }



    public static String numStolb(float[][] arr, int size1, int size2)
    {
        String numStolb = "" ;
        int countChetElem = 0;
        for (int i = 0; i < size1 ; i++)
        {
            for (int j = 0; j <size2 ; j++)
            {
                if (arr[j][i] % 2 == 0){
                    countChetElem++;
                }
            }
            if (countChetElem == size2)
            {
                numStolb += String.format("%d ", i+1);
            }
            countChetElem = 0;
        }
        return numStolb;
    }

    public static String numStMainDiagol(float[][] arr, int size1, int size2)
     {
         String numStolb = "" ;
         int sum = 0;
         for (int i = 0; i < size1 ; i++) {
             if (arr[i][i] < 0)
             {
                 for (int j = 0; j < size2; j++)
                 {
                     sum += arr[i][j];
                 }
                 numStolb += String.format("%d sum: %d\n", i, sum);
             }
         }
         return numStolb;
     }
     // 12 Task B
     public static float[] sumNegativOdElem(float[][] arr,int size1, int size2){
        float[] mass = new float[size1];
        int sum = 0;
        for(int i = 0; i <size1; i++)
        {
            for (int j = 0; j < size2; j++)
            {
                if(arr[j][i] < 0 && arr[j][i] % 2 != 0)
                {
                    sum += arr[j][i];
                }
            }
            mass[i] = Math.abs(sum);
            sum = 0;
        }
        return mass;
     }

     public static float[][] newSortedArray(float[][] array, int size1, int size2)
     {
         float[] character = Logic.sumNegativOdElem(array,size1,size2);
         boolean check = false;
         while (true) {
             for (int k = 1; k < size1; k++) {
                 if (character[k-1] > character[k]) {
                     float temp = character[k-1];
                     character[k - 1] = character[k];
                     character[k] = temp;
                     for (int i = 0; i < size2 ; i++){
                         int temp2 = (int) array[i][k];
                         array[i][k] = (int)array[i][k-1];
                         array[i][k-1] = temp2;
                     }
                    check = true;
                 }
             }
             if (check)
             {
                 check = false;
             }
             else
                 break;
         }
         return array;
     }

     // 2 Task A
    public static int sumOddElem(float[][] array, int size1, int size2)
    {
        int[] arrSum = new int[size1];
        int sum = 0;
        int count = 0;
        for(int i =0; i <size1; i++) {
            for (int j = 0; j < size2; j++) {
                if(array[i][j] %2 != 0) {
                    sum += Math.abs(array[i][j]);
                    count++;
                }
            }
            if (count == size2) {
                arrSum[i] = sum;
            }
            else {
                arrSum[i] = 0;
            }
            sum = 0;
        }
        int max = arrSum[0];
        int indRow = 0;
        for(int i = 1; i < size1; i ++)
        {
            if(max <= arrSum[i])
            {
                max = arrSum[i];
                indRow = i;
            }
        }
        return indRow + 1;
    }


    //9 Task B
    public static float[][] createNewArray(float[][] arr1, float[][] arr2, int size)
    {
        float[][] newArr = new float[size][size];
        float multRow = 1;
        for(int i = 0; i < size; i++)
        {
            for (int k = 0; k < size; k++)
            {
                multRow *= arr2[i][k];
            }

            for(int j = 0; j < size; j++)
            {
                newArr[i][j] = arr1[i][j] + multRow;
            }
            multRow = 1;
        }
        return newArr;
    }



}
