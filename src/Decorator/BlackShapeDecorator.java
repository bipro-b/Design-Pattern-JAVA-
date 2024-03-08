package Decorator;

public class BlackShapeDecorator extends ShapeDecorator{
    public BlackShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    public void draw(){
        decoratorShape.draw();
        setBlackBorder(decoratorShape);
    }
    public void setBlackBorder(Shape decoratorShae){
        System.out.println("Black border");
    }
}
