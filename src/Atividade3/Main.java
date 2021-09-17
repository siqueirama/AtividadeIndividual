package Atividade3;

public class Main {
    public static void main(String[] args) {

        double ladoA = 2;
        double ladoB = 2;
        double areaLajota = 8;
        double comprimentoLajota = 8;



        Retangulo retangulo = new Retangulo();

        retangulo.calculaArea(ladoA, ladoB);
        retangulo.calculaPerimetro(ladoA, ladoB);
        retangulo.quantidadePiso(areaLajota);
        retangulo.quatidadeRodape(comprimentoLajota);
    }
}
