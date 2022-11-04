package generation.dadosclientes.view;

import generation.dadosclientes.model.Cliente;

public class TestaCliente {

    public static void main(String[] args) {

        //Inserindo dados do cliente
        Cliente cliente1 = new Cliente("Silvio Julio   ",11242445560L,
               "Masculino","Rua A bloc 30","(71)99885-7799");

        Cliente cliente2 = new Cliente("Fernanda Santos",50948945612L,
                "Femenino","Rua B bloc 28","(71)99755-8822");


        //Saída dos dados do cliente1
         cliente1.visualizar();
        //Saída dos dados do cliente2
         cliente2.visualizar();


    }
}
