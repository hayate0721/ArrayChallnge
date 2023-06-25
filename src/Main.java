import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        int[] copy = Arrays.copyOf(unsortedArray, unsortedArray.length);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.toString(sortInteger(unsortedArray))); 
        System.out.println(Arrays.toString(sortInteger2(copy)));

    }

    public static int[] getRandomArray(int number){

        Random random = new Random();
        int[] intArray = new int[number];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(1000);
        }
        return intArray;
    }

    public static int[] sortInteger(int[] array){

        Arrays.sort(array);
        int[] desArray = new int[array.length];
        int count = 0;
        for(int i = array.length - 1; i >= 0; i--){
            desArray[i] = array[count];
            count++;
        }
        return desArray;
    }

    public static int[] sortInteger2(int[] array){ // different way to sort integers

        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
