import java.util.Arrays;

public class AreaMedia {
    public static double AreaMedia(FiguraGeometrica arr[]){
        double area = 0;
        for (FiguraGeometrica figura:arr) {
          area += figura.area();
        }
        return area / arr.length;
    }
}
