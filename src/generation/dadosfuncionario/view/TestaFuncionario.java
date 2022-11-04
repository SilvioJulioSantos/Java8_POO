package generation.dadosfuncionario.view;

import generation.dadosfuncionario.model.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(54698,"Marcos Lucas Silva",
            "Desenvolvedor Java","Desenvolver aplicação em Java","Tecnologia da informação");

       Funcionario funcionario2 = new Funcionario(875920,"Luiza Silva Santos",
                "Desenvolvedora Front-end","Desenvolver aplicação em Web","Tecnologia da informação");

     funcionario1.visualizar();
     funcionario2.visualizar();
     System.exit(0);

    }
}
