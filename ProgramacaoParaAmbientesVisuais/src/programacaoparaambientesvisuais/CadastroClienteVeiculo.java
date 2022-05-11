package programacaoparaambientesvisuais;

import javax.swing.JOptionPane;

public class CadastroClienteVeiculo {

    public static void main(String[] args) {
        
        String nome, cpf, dtNasc, mensagem, marca, modelo, ano;
        
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        cpf = JOptionPane.showInputDialog("Digite o seu cpf:");
        dtNasc = JOptionPane.showInputDialog("Digite sua data de nascimento:");
        
        marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        ano = JOptionPane.showInputDialog("Digite o ano do carro:");
        
        mensagem = "CADASTRO CLIENTE" +
                   "\nNome: " + nome +
                   "\nCPF: " + cpf +
                   "\nData de Nascimento: " + dtNasc +
                   "\n\n" +
                   "CADASTRO VEICULO" +
                   "\nMarca: " + marca +
                   "\nModelo: " + modelo +
                   "\nAno: " + ano;
        
        JOptionPane.showMessageDialog(null, mensagem);
                
    }
    
}
