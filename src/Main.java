import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj długość tablicy");
        int arrLenght = scanner1.nextInt();
        int[] arr1 = new int[arrLenght];
        for (int k = 0; k < arr1.length; k++) {
            System.out.println("Podaj " + (k + 1) + " element tablicy");
            int num1 = scanner1.nextInt();
            arr1[k] = num1;
        }
        int maxNum = 0;
        for (int i = 0; i < arr1.length-1; i++){
            if(arr1[i] < arr1[i+1]){
                maxNum = arr1[i+1];
            }
            else{
                maxNum = arr1[0];
            }
        }
        countingSort(arr1,maxNum);
        System.out.println(Arrays.toString(arr1));
    }


    public static void countingSort(int[] arrayNum, int maxNum) {

        int[] arrayTemp = new int[maxNum + 1];
        int size = arrayNum.length;
        for (int i = 0; i < maxNum + 1; i++) {
            arrayTemp[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            arrayTemp[arrayNum[i]]++;
        }
        int k = 0;
        for (int i = 0; i < maxNum + 1; i++) {
            for(int j = arrayTemp[i]; j>=1; j--) {
                arrayNum[k] = i;
                k++;
            }
        }
    }
}