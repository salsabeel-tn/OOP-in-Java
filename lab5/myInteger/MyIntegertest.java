public class MyIntegertest {

    public static void main(String[] args) {

        MyInteger n1 = new MyInteger(98);
 
        System.out.println("n1 is even? " + n1.isEven());
 
        System.out.println("n1 is prime? " + n1.isPrime());
 
        System.out.println("n1 is prime? " + n1.isOdd());
        char[] k = {'9','8'};
        String l = "98";
        
        double dig = MyInteger.parseIntChar(k);
        double digS = MyInteger.parseInt(l);
        System.out.println(dig);
        System.out.println(digS);

 
    }
 
 }
 class MyInteger {

    private int value; // An int data field named value that stores the int value
 
    // A constructor that creates a MyInteger object for the specified int
    public MyInteger(int value) {
        this.value = value;
    }
 
    // A get method that returns the int
    public int getValue() {
        return value;
    }
 
    // Method isEven()
    public boolean isEven() {
        // if value is even return true else false
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }
 
    // Method isOdd()
    public boolean isOdd() {
        // if value is odd return true else false
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }
 
    // Method isPrime()
    public boolean isPrime() {
        for (int i = 2; i <= value / 2; i++) {
            // if value is not prime return false else true
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    // Static methods isEven(int)
    static boolean isEven(int num) {
        // if value is even return true else false
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
 
    // Static methods isOdd(int)
    public boolean isOdd(int num) {
        // if value is odd return true else false
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }
 
    // Static methods isPrime(int)
    public boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            // if value is not prime return false else true
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

      // Static methods isEven(MyInteger)
      static boolean isEven(MyInteger num) {
        // if value is even return true else false
        if (num.value % 2 == 0) {
            return true;
        }
        return false;
    }
 
    // Static methods isOdd(MyInteger)
    public boolean isOdd(MyInteger num) {
        // if value is odd return true else false
        if (num.value % 2 != 0) {
            return true;
        }
        return false;
    }
 
    // Static methods isPrime(MyInteger)
    public boolean isPrime(MyInteger num) {
        for (int i = 2; i <= num.value / 2; i++) {
            // if value is not prime return false else true
            if (num.value % i == 0) {
                return false;
            }
        }
        return true;
    }
   
    //Method equals(int)
    public boolean equals(int num) {
        //if the value in the object is equal to the specified value.
        if(num == value) {
            return true;
        }
        return false;
    }

     //Method equals(MyInteger)
     public boolean equals(MyInteger num) {
        //if the value in the object is equal to the specified value.
        if(num.value == value) {
            return true;
        }
        return false;
    }
    public static double parseIntChar(char[] n){
        double dig=0;
        for (int i = 0; i < n.length; i++) {
            dig = dig + Math.pow(10, ((n.length - 1)-i)) * (n[i] - '0');  
        }
        return dig;

    }
    
    public static double parseInt(String n){
        double dig=0;
        for (int i = 0; i < n.length(); i++) {
            dig = dig  + Math.pow(10, ((n.length()-1)-i)) * (n.charAt(i) - '0');  
        }
        return dig;

    }
 }