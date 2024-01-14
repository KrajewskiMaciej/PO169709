import java.lang.Math;
public record Point2D(double x, double y) {
    public double distanceTo(Point2D other){
        double odx=this.x - other.x;
        double ody=this.y - other.y;

        return (odx*odx)+(ody*ody);
    }
}
