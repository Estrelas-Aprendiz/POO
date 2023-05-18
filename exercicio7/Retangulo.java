package exercicio7;

public class Retangulo {
    private double ladoA;
    private double ladoB;

    // Construtor
    public Retangulo(double ladoAConstrutor, double ladoBConstrutor) {
        this.ladoA = ladoAConstrutor;
        this.ladoB = ladoBConstrutor;
    }

    // Métodos para mudar o valor dos lados
    public void setLadoA(double ladoAConstutor) {
        this.ladoA = ladoAConstutor ;
    }

    public void setLadoB(double ladoBConstrutor) {
        this.ladoB = ladoBConstrutor;
    }

    // Métodos para retornar o valor dos lados
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return ladoA * ladoB;
    }

    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
