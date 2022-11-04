package generation.dadosfuncionario.view;

import generation.dadosfuncionario.model.Funcionario;
import generation.dadosfuncionario.model.Gerente;
import generation.dadosfuncionario.model.Vendedor;

public class TestaFuncionario {
    public static void main(String[] args) {

         //Instanciando um funcionário
         Funcionario funcionario1 = new Funcionario(54698,"Marcos Lucas Silva",1597534526,
                45,"Desenvolvedor Java","Desenvolver aplicação em Java","Tecnologia da informação");

          //Instanciando um gerente
          Gerente gerente1 = new Gerente(596,"Luiza Silva Santos",548123658l,
                48,"Gerente","Gerente 1","Administração",7000.0f);

        //Instanciando um vendedor
          Vendedor vendedor1 = new Vendedor(936,"Fabiana Mike Borges",2564897542l,50,"Vendas",
                "Consultor de vendas","Vendas",2000.0f);


         //funcionario1.visualizar();

          gerente1.visualizar();
          System.out.println();
          vendedor1.visualizar();

         System.exit(0);

    }
}
