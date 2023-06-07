
public class Main {
    public static void main(String[] args) {
        int[] array = {8,7,1,3,0,9,5,5,4};
        System.out.println("Given Array is");
        for(int i = 0 ; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        int max = 0, min = 0;
        System.out.println("Demo for Printing Maximum and Minimum value in the given array");
        for(int i = 0 ; i< array.length; i++){
           max = Math.max(max, array[i]);
           min = Math.min(min, array[i]);
        }
        System.out.println("Maximum value is"+ max);
        System.out.println("Minimum value is"+ min);
        System.out.println("Demo to reverse the given Array");
        int midIndex = array.length/2;
        int lastIndex = (array.length-1);
        System.out.println("Mid Index"+ midIndex);
        for(int j =0 ; j < midIndex ; j ++){
            int temp = array[j];
            array[j] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }
        System.out.println("Reverse Array is");
        for(int i = 0 ; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        System.out.println("Demo for shifting the given Array to by 3 digits");
        int x = 3;
        for(int i = 0; i < x; i++){
            int j, first;
            first = array[0];
            for(j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[j] = first;
        }

        for(int i = 0 ; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}