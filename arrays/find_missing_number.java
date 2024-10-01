package arrays;

public class find_missing_number {
    // given an array of n-1 distint natural numbers of the range 1 to n , find the
    // missing number.
    public int findmissingNumber(int arr[]) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum = sum - num;

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 6 };
        find_missing_number fmn = new find_missing_number();
        int result = fmn.findmissingNumber(arr);
        System.out.println(result);

    }

}