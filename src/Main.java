public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            String fizzOrBuzz = "";

            if (i % 3 == 0) {

                fizzOrBuzz += "Fizz";
            }
            if (i % 5 == 0) {

                fizzOrBuzz += "Buzz";
            }

            if (fizzOrBuzz != "") {
                System.out.println(fizzOrBuzz);
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }

}

