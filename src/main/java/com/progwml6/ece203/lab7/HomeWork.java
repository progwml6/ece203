package com.progwml6.ece203.lab7;

public class HomeWork
{
    public static void main (String[] args)
    {
        
    }

    public double median (int[] i)
    {
        int n = i.length;
        i = selectionSort(i);
        if (n % 2 == 1)
        {
            return i[(n - 1) / 2];
        }
        else
        {
            return (i[n / 2] + i[(n / 2) - 1]) / 2;
        }

    }

    public static int[] selectionSort (int[] intArray)
    {
        for (int out = 0; out < intArray.length - 1; out++)
        {
            int min = out;
            for (int in = out + 1; in < intArray.length; in++)
                if (intArray[in] < intArray[min])
                    min = in;
            swap(intArray, out, min);
        }
        return intArray;
    }

    private static void swap (int[] intArray, int pos1, int pos2)
    {
        int temp = intArray[pos1];
        intArray[pos1] = intArray[pos2];
        intArray[pos2] = temp;
    }

    public int[] shiftLT (int[] A, int k)
    {
        int tmp;
        for (int i = 0; i < k; i++)
        {
            tmp = A[0];
            for (int j = 0; j < A.length - 1; j++)
                A[j] = A[j + 1];
            A[A.length - 1] = tmp;
        }
        return A;
    }
}