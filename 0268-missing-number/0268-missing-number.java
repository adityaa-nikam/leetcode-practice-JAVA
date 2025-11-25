class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n-1)/2;
        for ( int i : arr){
            sum = sum - i;
        }
        return sum;
    }
}