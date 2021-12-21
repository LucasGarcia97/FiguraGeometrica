public class Retangulo extends FiguraGeometrica {

        private float altura;
        private float base;

        @Override
        public double area() {
            return this.base * this.altura;
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

        public Retangulo(float altura, float base) {
            this.altura = altura;
            this.base = base;
        }

        public float getAltura() {
            return altura;
        }
    }
