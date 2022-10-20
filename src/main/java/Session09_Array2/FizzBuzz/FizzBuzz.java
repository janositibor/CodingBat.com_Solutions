package Session09_Array2.FizzBuzz;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        int length=end-start;
        String replace3="Fizz";
        String replace5="Buzz";
        String replace3and5="FizzBuzz";

        String[] output=new String[length];

        for (int i = start; i < end; i++) {
            if(i%15==0){
                output[i-start]=replace3and5;
                continue;
            }
            if(i%3==0){
                output[i-start]=replace3;
                continue;
            }
            if(i%5==0){
                output[i-start]=replace5;
                continue;
            }
            output[i-start]=String.valueOf(i);
        }
        return output;
    }
}
