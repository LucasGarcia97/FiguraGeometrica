public class Triangulo extends FiguraGeometrica {

    private float altura;
    private float base;

    @Override
    public double area() {
        return this.base * this.altura / 2;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }
}
