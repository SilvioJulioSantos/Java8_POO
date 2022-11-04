package generation.dadosclientes.view;

import generation.dadosclientes.model.Cliente;
import generation.dadosclientes.model.PessoaFisica;
import generation.dadosclientes.model.PessoaJuridica;

public class TestaCliente {

    public static void main(String[] args) {


        //Inserindo dados do cliente
        Cliente cliente1 = new Cliente("Silvio Julio   ",
               32,"Masculino","Rua Alfa N bloc 30","(71)99885-7799");


        //PessoaFisica
        PessoaFisica pessoaFisica1 = new PessoaFisica("Marcos Luky Silva",34,
                36945612345l,"Masculino","Rua Miranda S, blocoC 56","(71)98822-1147" );

        PessoaJuridica pessoaJuridica1  = new PessoaJuridica("MC tecnologia da informação","Fabina Silva Santos",44, "Femenino","Rua Lucas V bloco 12 casa 20",
                "(71)98822-1147","41.831.694/0001-96l");


         //Saída dos dados do cliente1
         cliente1.visualizar();

          System.out.println();

          //Saída dos dados do PessoaFisica
          pessoaFisica1.visualizar();

        System.out.println();

        //Saída dos dados do PessoaJuridica
        pessoaJuridica1.visualizar();



    }
}
