public class Runner {
    public static void main(String[] args) {
        int[] intArr = InPlaceSorts.randIntArr(20);
        double[] doubleArr = InPlaceSorts.randDoubleArr(20);
        String[] stringArr = InPlaceSorts.randStringArr(10,10);
        int[] copyArr1 = InPlaceSorts.copyIntArray(intArr);
        double[] copyArr2 = InPlaceSorts.copyDoubleArray(doubleArr);
        String[] copyArr3 = InPlaceSorts.copyStringArray(stringArr);
        System.out.print("Before: ");
        System.out.println();
        for (int num:intArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(copyArr3);
        time = System.nanoTime() - time;
        System.out.print("After: ");
        System.out.println();
        for (String str:copyArr3) {
            System.out.print(str + " ");
            System.out.println();
        }
        if (!InPlaceSorts.isSorted(testArr) && !InPlaceSorts.checkSum(finalArr, testArr)) {
            System.out.println("Something went wrong in the sorting method that the numbers are not correctly sorted and there are different numbers within your previous array and the array after the sorting method!");
        }
        else if (!InPlaceSorts.isSorted(testArr) && InPlaceSorts.checkSum(finalArr, testArr)) {
            System.out.println("All of your numbers within your array are the same as before but something went wrong in your sorting method that they are not correctly sorted!");
        }
        else if (InPlaceSorts.isSorted(testArr) && !InPlaceSorts.checkSum(finalArr, testArr)) {
            System.out.println("All of your numbers are correctly sorted but something went wrong in your sorting method that there are different numbers within your previous array and the array after the sorting method!");
        }
        else {
            System.out.println("All of your numbers are correctly sorted and contain all of the same numbers within the previous array and the array after the sorting method!");
        }
        System.out.println("Time taken: " + time + " nanoseconds");
    }

}
