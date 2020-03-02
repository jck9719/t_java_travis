public class FizzBuzz {
    public String print(int number){

        if(number < 0){
            throw new IllegalArgumentException();
        }
        else if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }

        return "";
    }

    public boolean checkIfPrime(int number){
        int m = number / 2;
        if (number <= 1){
            return false;
        }
        else {
            for (int i = 2; i <= m; ++i){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public double doubleEquals (double a){
        return a;
    }

    public boolean areYouAnAlien (String answer){
        if (answer.equals("No")){
            return false;
        }
        else {
            return true;
        }

    }

    public String isNull (){
        String noll = null;
        return noll;
    }

    public String isNotNull (){
        String notNull = "I am definitely not null :)";
        return notNull;
    }
}