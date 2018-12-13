import java.util.Arrays;

public class InPlaceSortsRunner
{
    public static void main(String[] args)
    {
        String[] stringArr = randomStrArr(100,2);
        double[] doubleArr = randomDoubleArr(100);
        int[] intArr = randomIntArr(100);

        System.out.println(Arrays.toString(stringArr));
        InPlaceSorts.bubbleSort(stringArr);
        printArr(stringArr);

        System.out.println(Arrays.toString(intArr));
        InPlaceSorts.insertionSort(intArr);
        printArr(intArr);

        System.out.println(Arrays.toString(doubleArr));
        InPlaceSorts.selectionSort(doubleArr);
        printArr(doubleArr);
    }
    public static void printArr(String[] arr)
    {
        String output = "";
        for(int i = 0; i< arr.length; i++)
        {
            output+= arr[i]+ ",";
        }
        System.out.println(output);
    }
    public static void printArr(int[] arr)
    {
        String output = "";
        for(int i = 0; i< arr.length; i++)
        {
            output+= arr[i]+ ",";
        }
        System.out.println(output);
    }
    public static void printArr(double[] arr)
    {
        String output = "";
        for(int i = 0; i< arr.length; i++)
        {
            output+= arr[i]+ ",";
        }
        System.out.println(output);
    }
    public static int[] randomIntArr(int amount)
    {
        int[] randomArr = new int[amount];
        for(int i =0; i<randomArr.length; i++)
        {
            randomArr[i] = (int)(Math.random()*100);
        }
        return randomArr;
    }
    public static double[] randomDoubleArr(int amount)
    {
        double[] randomArrd = new double[amount];
        for(int i = 0; i <randomArrd.length; i++)
        {
            randomArrd[i] = Math.random()*100;
        }
        return randomArrd;
    }
    public static String[] randomStrArr(int num, int length){
        String[] arr = new String[num];
        while(num > 0){
            int i = 0;
            String s = "";
            while (i < length){
                char c = (char)((Math.random()*26) + 65);
                s += c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
