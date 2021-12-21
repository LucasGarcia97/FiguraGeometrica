public class Circulo extends FiguraGeometrica {
    float pi = 3.14f;
    float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return this.raio * this.raio * this.pi;
    }
}
