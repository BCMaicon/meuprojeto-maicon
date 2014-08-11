package orientação_aula1;

public class Orientação_aula1 {

    public static void main(String[] args) {
        // Criar o objeto da classse calculadora
        Calculadora calc = new Calculadora();
        Integer resS, resSub,resM;
        double resD;
        // Atribuir valores da soma
        calc.AtribuirA(3);
        calc.AtribuirB(8);
        resS = calc.somar();

        // Atribuir valores da subtração
        calc.AtribuirC(5);
        calc.AtribuirD(1);
        resSub = calc.subtracao();
        
        // Atribuir valores da multiplicação
        calc.AtribuirE(5);
        calc.AtribuirF(2);
        resM = calc.multiplicacao();
        
        // Atribuir valores da divisão
        calc.AtribuirG(1);
        calc.AtribuirH(5);
        resD = calc.divisao();
        
        // Resultado da soma
        System.out.println("O resultado da soma é:" + resS);
        // Resultado da subtração
        System.out.println("O resultado da subtração é:" + resSub);
        // Resultado da multiplicação
        System.out.println ("O resultado da multiplicação é:" + resM);
        // Resultado da divisão
        System.out.println ("O resultado da divisão é:" + resD);
    }

}
