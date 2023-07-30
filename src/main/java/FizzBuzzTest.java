public class FizzBuzzTest {

  /*Realize the function "fizzbuzztest" which is a bit array.
   *If the number multiples of three, print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five, print "FizzBuzz
   * If the number is not a multiple of these numbers, then you need to throw out the IllegalArgumentException.
   * */
  public static byte[] fizzbuzztest(int[] values) {
    for(int number : values) {
      if(number % 3 == 0 && number % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if(number % 3 == 0) {
        System.out.println("Fizz");
      } else if(number % 5 == 0) {
        System.out.println("Buzz");
      } else {
        throw new IllegalArgumentException("Number " + number + " is not a multiple of 3 or 5");
      }
    }
    return new byte[0];
  };

    public static void main(String[] args) {
      // Test with some numbers
      int[] numbers = {3, 5, 15, 2};
      fizzbuzztest(numbers);
    }
  }

