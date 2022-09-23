import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6,7},{12,666,789,76}};
        //finding element in an array is present or not.
        System.out.println(isPresent(arr,666));
        //finding index of  target element
        int[]ans=index(arr,666);
        System.out.println(Arrays.toString(ans));
        //finding the max in the array
        System.out.println(max(arr));

    }
    public static boolean  isPresent(int[][] arr,int target){
        for(int[] ints:arr){
            for(int element: ints){
                if(element==target)
                    return true;
                }
        }
        return false;
    }

    public static int[] index(int[][] arr,int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
    public static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        System.out.println("The min value is "+Integer.MIN_VALUE);
        for(int[] ints:arr){
            for(int element: ints){
                if(element>max)
                    max=element;
            }
        }
        return max;
    }
}
