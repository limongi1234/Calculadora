package primeiroaplicativojava;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
               
    String num1, num2, opcao;
        int resultado = 0;
        Operacoes objOperacoes = new Operacoes();

        opcao = JOptionPane.showInputDialog(null, "Escolha uma opção abaixo\n"
                + "1- Adição\n"
                + "2- Subtração\n"
                + "3- Divisão\n"
                + "4- Multiplicação\n"
                + "9- Sair");

        while (!opcao.equals("9")) {
            switch (Integer.parseInt(opcao)) {
                case 1: {

                    num1 = objOperacoes.Leitura(1);
                    num2 = objOperacoes.Leitura(2);
                    resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                case 2: {
                    num1 = objOperacoes.Leitura(1);
                    num2 = objOperacoes.Leitura(2);
                    resultado = objOperacoes.Subtrair(Integer.parseInt(num1), Integer.parseInt(num2));
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                case 3: {
                    num1 = objOperacoes.Leitura(1);
                    num2 = objOperacoes.Leitura(2);
                    resultado = objOperacoes.Divisao(Integer.parseInt(num1), Integer.parseInt(num2));
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                case 4: {
                    num1 = objOperacoes.Leitura(1);
                    num2 = objOperacoes.Leitura(2);
                    resultado = objOperacoes.Multiplicacao(Integer.parseInt(num1), Integer.parseInt(num2));
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                }
                default: {

                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }



            opcao = JOptionPane.showInputDialog(null, "Escolha uma opção abaixo\n"
                    + "1- Adição\n"
                    + "2- Subtração\n"
                    + "3- Divisão\n"
                    + "4- Multiplicação\n"
                    + "9- Sair");
        }

        /*if(opcao.equals("1"))
        {
        num1 = JOptionPane.showInputDialog("Entre com o primeiro valor");
        num2 = JOptionPane.showInputDialog("Entre com o segundo valor");

        resultado = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
        }
        else if(opcao.equals("2"))
        {
        num1 = JOptionPane.showInputDialog("Entre com o primeiro valor");
        num2 = JOptionPane.showInputDialog("Entre com o segundo valor");

        resultado = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
        }
        else if(opcao.equals("3"))
        {
        num1 = JOptionPane.showInputDialog("Entre com o primeiro valor");
        num2 = JOptionPane.showInputDialog("Entre com o segundo valor");

        resultado = String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
        }
        else if(opcao.equals("4"))
        {
        num1 = JOptionPane.showInputDialog("Entre com o primeiro valor");
        num2 = JOptionPane.showInputDialog("Entre com o segundo valor");

        resultado = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        }*/




    }
}
