package programacaoparaambientesvisuais;

import programacaoparaambientesvisuais.classes.Colaborador;

public class CadastroColaborador {

    public static void main(String[] args) {
       
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Guilherme");
        colaborador.setIdade(19);
        
        System.out.println("Nome: " + colaborador.getNome() +
                           "\nIdade: " + colaborador.getIdade());
        
        //OPCAO COM SCANNER
        /*Scanner sc = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();
        
        System.out.println("Informe seu nome: ");
        colaborador.setNome(sc.next());
        
        System.out.println("Informe sua idade: ");
        colaborador.setIdade(sc.nextInt());
        
        System.out.println("Nome: " + colaborador.getNome() +
                           "\nIdade: " + colaborador.getIdade());*/
        
    }
    
}
