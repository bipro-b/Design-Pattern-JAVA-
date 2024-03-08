package Facade;

public class FacadeShape {
    private Shape rectangle;
    private Shape circle;

    public FacadeShape() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawCircle(){
        circle.draw();
    }
}
