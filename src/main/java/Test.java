public class Test {

    public static void main(String[] args) {
        int round = (int) Math.round(Math.random());
        try {
            System.out.println(round);
            System.out.println("fuck");
        } catch (ArithmeticException e) {

        }
    }

}




