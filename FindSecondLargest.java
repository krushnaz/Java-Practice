class FindSecondLargest{
    static int SecondLargest(int arr[]){
        int firstLargest = 0;
        int secondLargest = 0;

        if(arr[0] > arr[1]){
            firstLargest = arr[0];
            secondLargest = arr[1];
            // System.out.println("firstLargest "+firstLargest);
            // System.out.println("secondLargest "+secondLargest);


        }else{
            firstLargest = arr[1];
            secondLargest = arr[0];
            // System.out.println("firstLargest "+firstLargest);
            // System.out.println("secondLargest "+secondLargest);
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
                // System.out.println("firstLargest "+firstLargest);

            }else{
                if(arr[i] < firstLargest && arr[i] > secondLargest){
                    secondLargest = arr[i];
                    // System.out.println("secondLargest "+secondLargest);
                }
            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        System.out.println("second largest element in array is : "+ SecondLargest(new int[]{1,2,3,4,5,6}));
        // System.out.println("second largest element in array is : "+ SecondLargest(new int[]{21,1,11,23,43,14}));
        // System.out.println("second largest element in array is : "+ SecondLargest(new int[]{1,2,3,4,5,6}));
    }
}