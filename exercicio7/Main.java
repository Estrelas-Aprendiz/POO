package exercicio7;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto retângulo com lados 4.5 e 3.2
        Retangulo retangulo = new Retangulo(4.5, 3.2);

        // Exibir os valores dos lados
        System.out.println("Lado A: " + retangulo.getLadoA());
        System.out.println("Lado B: " + retangulo.getLadoB());

        // Calcular e exibir a área
        double area = retangulo.calcularArea();
        System.out.println("Área: " + area);

        // Calcular e exibir o perímetro
        double perimetro = retangulo.calcularPerimetro();
        System.out.println("Perímetro: " + perimetro);

        // Mudar o valor dos lados
        retangulo.setLadoA(5.1);
        retangulo.setLadoB(2.8);

        // Exibir os novos valores dos lados
        System.out.println("Novo valor do lado A: " + retangulo.getLadoA());
        System.out.println("Novo valor do lado B: " + retangulo.getLadoB());

        // Calcular e exibir a nova área
        area = retangulo.calcularArea();
        System.out.println("Nova área: " + area);

        // Calcular e exibir o novo perímetro
        perimetro = retangulo.calcularPerimetro();
        System.out.println("Novo perímetro: " + perimetro);
    }
}
