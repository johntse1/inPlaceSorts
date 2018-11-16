public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {
        
    }
    public static void selectionSort(double[] list1)
    {
        double swap = 0;
        double minimum = 0;
        for(int i = 0; i < list1.length; i++ )
        {
            swap = 1;
            minimum = list1[i];
            for(int j = i; j < list1.length; j++)
            {
                if(list1[j] < list1[(int) minimum])
                {
                    swap = j;
                    minimum = list1[j];
                }
                double swapper = list1[j];
                list1[(int) minimum] = list1[(int) swap];
                list1[(int) swap] = swapper;
            }
        }
    }
    public static void bubbleSort(String[] list1)
    {
        int swaps = 1;
        while (swaps != 0)
        {
            swaps = 0;
            for(int j = 0; j < list1.length; j++)
            {
                if(list1[j].compareTo(list1[j+1]) > 0)
                {
                    swaps +=1;
                    String swapper = list1[j];
                    list1[j] = list1[j+1];
                    list1[j+1] = swapper;
                }
            }
        }
    }
}
