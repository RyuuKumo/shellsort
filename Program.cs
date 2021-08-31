using System;
using System.Collections;

namespace ShellSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 5, 1, 11, 0, 18, 22, 67, 51, 6 };
            int size;

            size = arr.Length;
            Console.WriteLine("Original Array Elements :");
            show_array_elements(arr);
            shellSort(arr, size);
            Console.WriteLine("\nSorted Array Elements :");
            show_array_elements(arr);
        }

        static void shellSort(int[] arr, int array_size)
        {
            int i, j, intervalo, temp;
            intervalo = 3;
            while (intervalo > 0)
            {
                for (i = 0; i < array_size; i++)
                {
                    j = i;
                    temp = arr[i];
                    while ((j >= intervalo) && (arr[j - intervalo] > temp))
                    {
                        arr[j] = arr[j - intervalo];
                        j = j - intervalo;
                    }
                    arr[j] = temp;
                }
                if (intervalo / 2 != 0)
                    intervalo = intervalo / 2;
                else if (intervalo == 1)
                    intervalo = 0;
                else
                    intervalo = 1;
            }
        }

        static void show_array_elements(int[] arr)
        {
            foreach (var element in arr)
            {
                Console.Write(element + " ");
            }
            Console.Write("\n");

        }
    }
}
