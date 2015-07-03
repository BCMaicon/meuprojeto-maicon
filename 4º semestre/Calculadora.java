package orientação_aula1;

public class Calculadora {
    
    // Soma
    // Atributos
    Integer a,b;
    double c,d;

    // Métodos
    void AtribuirA(Integer valor) {
        a = valor;
    }

    void AtribuirB(Integer valor) {
        b = valor;
    }

    Integer somar() {
        return a + b;

    }
    // Subtração
    // Métodos
    void AtribuirC(Integer valor) {
        a = valor;
    }

    void AtribuirD(Integer valor) {
        b = valor;
    }

    Integer subtracao() {
        return a - b;
    }
    // Multiplicação
    // Métodos
    void AtribuirE(Integer valor) {
        a = valor;
    }

    void AtribuirF(Integer valor) {
        b = valor;
    }
    Integer multiplicacao() {
        return a * b;

    }
    // Divisão
    // Métodos
    void AtribuirG(Integer valor) {
        c = valor;
    }

    void AtribuirH(Integer valor) {
        d = valor;
    }
    double divisao() {
        return c / d;

    }
    
}
