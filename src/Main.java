public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Ball ball1 = new Ball(1, "maciek");
        System.out.println(ball1);
        Ball ball2 = (Ball) ball1.clone();
        System.out.println(ball2);
        System.out.println(ball1.equals(ball2));
        Ball ball3 = ball1;
        System.out.println(ball1.equals(ball3));
    }
}