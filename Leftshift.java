/*
Rotate the elements of given array by d positions
*/

public class Leftshift {
        /*Function to left rotate arr[] of size n by d*/
        void leftRotate(int a[], int d, int n)
        {
            for (int i = 0; i < d; i++)                      //assign i 0 to d
                leftRotatebyOne(a, n);                    //it means it rotates up to d size only
        }

        void leftRotatebyOne(int a[], int n)
        {
            /*when we shifting array to left side
            * loop through array and increase it by 1
            * This is same logic like swapping of numbers but some changes*/
           int temp = a[0];
            for (int i = 0; i < n - 1; i++)
                a[i] = a[i + 1];
            a[n-1] = temp;
        }
            /*In case of right shifting start loop from arr.length
            * to 0 and decrease array by 1*/

        void display(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

        // Driver program to test above functions
        public static void main(String[] args)
        {
            Leftshift l = new Leftshift();
            int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
            l.leftRotate(arr, 2, 7);
            l.display(arr, 7);
        }

}
