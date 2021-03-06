class quick {
    public static void main(String[] args) {
        int[]arr = {15,9,7,13,12,16,4,18,11};
        int l = arr.length;
        quick obj = new quick();
        obj.quicksortrecursion(arr,0,l-1);
        obj.printArray(arr);
    }
    int partition(int []arr,int low,int high)
    {
        int pivot = arr[(low+high)/2];
        while(low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;


            }
        }
        return low;
    }
    void quicksortrecursion(int[] arr,int low,int high)
    {
        int m = partition(arr,low,high);
        if(low<m-1)
        {
            quicksortrecursion(arr,low,m-1);
        }
        if(m<high)
        {
            quicksortrecursion(arr,m,high);
        }
    }
    void printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.println(i+"");
        }
    }
}
