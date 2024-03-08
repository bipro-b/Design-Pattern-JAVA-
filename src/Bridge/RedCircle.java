package Bridge;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int r, int x, int y) {
        System.out.println("Red circle radius "+r+" x "+x+" y "+y);
    }
}
