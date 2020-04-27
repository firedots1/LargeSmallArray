public class LargeSmallArray {
    public static void main (String args[]) {

        // assign values to array
        // set the value of an variable of called LargestNumber to first value of the array. [e.g 5,7 and 2]
        // We will then compare the values of largest number to the other index in the array.
        // For loop to see to all the values of the array.
        // If 5 is less than 7 then LargestNumber will be 7.
        // If the first index (value of the Array) is greater than second index then LargestNumber will be second index
        // Print the largest element of the array.
        int number[] = new int [3];
        int largestNumber;
        int smallestNumber;
        number[0] = 5;
        number[1] = 7;
        number[2] = 2;
        largestNumber = number[0];
        smallestNumber = number[0];
        for (int i = 1; i < number.length; i++ ) { // at this point largest number = 5
            if (largestNumber < number[i]) { // if largestNumber 5 is less than 7 then
                largestNumber = number[i];
            }
            if (smallestNumber > number[i]) {
                smallestNumber = number[i];
            }
        }
        System.out.println("The Smallest is: " + smallestNumber); //print out the smallest
        System.out.println("The Largest is: " + largestNumber); //print out the largest
        }

    }
