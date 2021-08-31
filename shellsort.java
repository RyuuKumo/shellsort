import java.util.Scanner;


public class shellsort
{
    public static final int SIZE = 5;
    public static int[] array = new int[SIZE];

    /**
     *Shell Sort Algorithm.
     **/
    public static void sort()
    {
        // Intevalo = Números_de_Elementos / 2
        int intervalo = array.length / 2;
        while (intervalo > 0)
        {
            //           i = 2        hasta que: 2 < 5    aumento de 1 en 1
            for (int i = intervalo; i < array.length; i++)
            {
                int temp = array[i];
                // j = 2
                int j = i;

                //  meintras 2 >= 2        array[2 - 2 = 0] > array[i]
                while (j >= intervalo && array[j - intervalo] > temp)
                {
                    array[j] = array[j - intervalo];
                    j = j - intervalo;
                }
                array[j] = temp;
            }
            if (intervalo == 2)
                intervalo = 1;
            else
                // intervalo = intervalo * (5.0 / 11)
                intervalo *= (5.0 / 11);
        } //End While
    }


    public static void main(String args[])
    {
        System.out.println("Enter 5 Elements");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++)
        {
            System.out.print("Enter element "+(i+1)+" :  ");
            array[i] = input.nextInt();
        }
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nSorted array: ");
        sort();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
