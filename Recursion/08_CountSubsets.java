class CountSubsets{

    static int countSubsets(int[] arr,int index, int sum, int target){
        if(index == arr.length){
            if(sum == target)
            return 1;
            return 0;
        }
        int take = countSubsets(
            arr, index + 1, sum + arr[index], target
        );

        int skip = countSubsets(
            arr, index + 1, sum, target
        );

        return take + skip;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3};
        
        int target = 3;

        System.out.print(countSubsets(arr, 0, 0, target));
    }
}