public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {
        int swapPos;
        int min;

        for(int i = 1;i<list1.length;i++)
        {
            swapPos = i;
            min = list1[swapPos];

            for(int a = i-1;a>=0;a--)
            {
                if(list1[a]>min)
                {
                    swap(list1,swapPos,a);
                    swapPos = a;
                    min = list1[swapPos];
                }
                else
                {
                    a=-1;
                }
            }
        }
    }
    public static void selectionSort(double[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++){
            temp = i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            doubleSwap(arr, temp, i);
        }
    }
    public static void bubbleSort(String[] list1)
    {
        int swaps = 1;
        while (swaps != 0)
        {
            swaps = 0;
            for(int j = 0; j < list1.length-1; j++)
            {
                if(list1[j].compareTo(list1[j+1]) > 0)
                {
                    swaps +=1;
                    stringSwap(list1,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i,int j)
    {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
    public static void doubleSwap(double[] arr, int i, int j)
    {
        double k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
    public static void stringSwap(String[] arr, int i, int j)
    {
        String k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

}
