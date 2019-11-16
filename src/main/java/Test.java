public class Test {

    public static void main(String[] args) {
        int round = (int) Math.round(Math.random());
        try {
            System.out.println(round);
        } catch (ArithmeticException e) {

        }
    }

}




