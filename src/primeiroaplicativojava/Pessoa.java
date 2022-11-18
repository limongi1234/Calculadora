
package primeiroaplicativojava;

import javax.swing.JOptionPane;

public class Pessoa {
    
    private String cpf;
    
    public void setCpf(String cpf)
    {
        //validação
        JOptionPane.showMessageDialog(null, "Cpf incorreto");
        //erro
        this.cpf = cpf;
    }
    
}
