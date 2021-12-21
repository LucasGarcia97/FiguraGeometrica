public class Main {
    public static void main(String[] args) {
        FiguraGeometrica  t = new Triangulo(5, 10);
        FiguraGeometrica r = new Retangulo(8,12);
        FiguraGeometrica c = new Circulo(6);
        FiguraGeometrica[] arr = new FiguraGeometrica[3];
        arr[0] = t;
        arr[1] = r;
        arr[2] = c;

        double areaMedia = AreaMedia.AreaMedia(arr);
        System.out.println(areaMedia);
    }
}
