package Atividade3;

import lombok.Data;

@Data
public class Retangulo {

    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calculaArea(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        System.out.println("Area Total= "+area);
        setArea(area);
    }

    public void calculaPerimetro(double ladoA, double ladoB) {
        double perimetro = 2 * (ladoA + ladoB);
        System.out.println("Perimetro = "+perimetro);
        setPerimetro(perimetro);
    }


    public void quantidadePiso( double areaLajota) {
        double pisos = getArea() / areaLajota;
        System.out.println("Quantidade de Pisos = "+pisos);
    }

    public void quatidadeRodape(double comprimentoLajota) {
        double rodape = getPerimetro() / comprimentoLajota;
        System.out.println("Quantidade de lajotas = "+rodape);
    }
}
