import java.util.HashMap;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int target = 100;
        System.out.println("Given Array is :: ");
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0,j=0; i < array.length && j < array.length; i++) {
            int diff = target - array[i];
            if(array[j] == diff)
                map.put(i,j);
            if(j != array.length-1) {
                j++;
                i=-1;
            }
        }
        System.out.println("Target found at ::");
        if(map.isEmpty())
            System.out.println("No pair found");
        else
            map.forEach((key,value) -> System.out.println("["+key+ ","+value+"]"));
    }
}