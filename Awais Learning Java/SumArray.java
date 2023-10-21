public class SumArray {

    public void arraySum() {
        // array
        int[] myArray = { 1, 5, 10, 25 };
        int sum = 0;
        int i;

        // loop through the array elements and the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        System.out.println("The sum is - " + sum);
    }

}
