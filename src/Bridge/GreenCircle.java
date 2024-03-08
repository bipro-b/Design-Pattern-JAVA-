package Bridge;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int r, int x, int y) {
        System.out.println("Green circle radius "+r+" x "+x+" y "+y);
    }
}
