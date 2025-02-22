package EjercicioRectangulo;

public class Rectangulo {
    private int altura;
    private int anchura;

    public Rectangulo(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int calcularArea() {
        return this.altura * this.anchura;
    }

    public int calcularPerimetro() {
        return 2 * (this.altura + this.anchura);
    }
}