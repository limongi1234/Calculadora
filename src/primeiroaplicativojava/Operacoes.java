package primeiroaplicativojava;

import javax.swing.JOptionPane;

public class Operacoes {

    /**Método responsável pela adição de 2 valores
     @param num1 Primeiro valor a ser calculado
     @param num2 Segundo valor a ser calculado
     @return int Valor calculado*/
    public int Somar(int num1, int num2)
    {
        return num1 + num2;
    }

    /**Método responsável pela subtração de 2 valores
     @param num1 Primeiro valor a ser calculado
     @param num2 Segundo valor a ser calculado
     @return int Valor calculado*/
    public int Subtrair(int num1, int num2)
    {
        return num1 - num2;
    }

    /**Método responsável pela multiplicação de 2 valores
     @param num1 Primeiro valor a ser calculado
     @param num2 Segundo valor a ser calculado
     @return int Valor calculado*/
    public int Multiplicacao(int num1, int num2)
    {
        return num1 * num2;
    }

    /**Método responsável pela divisão de 2 valores
     @param num1 Primeiro valor a ser calculado
     @param num2 Segundo valor a ser calculado
     @return int Valor calculado*/
    public int Divisao(int num1, int num2)
    {
        return num1 / num2;
    }

    /**Método responsável pela leitura das informações
     @param posicao Posição do contador na leitura
     @return String Mensagem*/
    public String Leitura(int posicao)
    {
        return JOptionPane.showInputDialog("Entre com o valor "+ posicao);
    }
}
