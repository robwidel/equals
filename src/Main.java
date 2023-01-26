public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Ball ball1 = new Ball(1, "maciek");
        Ball ball2 = (Ball) ball1.clone();
        Ball ball3 = ball1;
        Ball ball4 = new Ball(1, "maciek");
        System.out.println(ball1);
        System.out.println(ball4);


        System.out.println(ball1.equals(ball4));

    }
}