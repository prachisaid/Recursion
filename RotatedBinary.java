package recursion;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBinary(arr, 2, 0, arr.length-1));
    }

    static int rotatedBinary(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBinary(arr, target, start, mid - 1);
            }
            else{
                return rotatedBinary(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return rotatedBinary(arr, target, mid + 1, end);
        }

        return rotatedBinary(arr, target, start, mid - 1);
    }
}
