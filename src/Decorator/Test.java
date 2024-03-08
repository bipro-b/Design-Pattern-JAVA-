package Decorator;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        Shape redRectangle  = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

        Shape blackCircle = new BlackShapeDecorator(new Circle());
        blackCircle.draw();
    }
}
