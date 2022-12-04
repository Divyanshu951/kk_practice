public class temp {
    static void thirdLargest(int arr[],
                             int arr_size)
    {
    /* There should be
    atleast three elements */
        if (arr_size < 3)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        // Find first
        // largest element
        int first = arr[0];
        for (int i = 1;
             i < arr_size ; i++)
            if (arr[i] > first)
                first = arr[i];

        // Find second
        // largest element
        int second = 0;
        for (int i = 0;
             i < arr_size ; i++)
            if (arr[i] > second &&
                    arr[i] < first)
                second = arr[i];

        // Find third
        // largest element
        int third = 0;
        for (int i = 0;
             i < arr_size ; i++)
            if (arr[i] > third &&
                    arr[i] < second)
                third = arr[i];

        System.out.printf("The third Largest " +
                "element is %d\n", third);
    }

    // Driver code
    public static void main(String []args)
    {
        int arr[] = {1,2,2,3,3,4};
        int n = arr.length;
        thirdLargest(arr, n);
    }
}
