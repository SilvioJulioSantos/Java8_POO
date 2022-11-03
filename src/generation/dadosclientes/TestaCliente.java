package generation.dadosclientes;

public class TestaCliente {

    public static void main(String[] args) {

        //Inserindo dados do cliente
        Cliente cliente1 = new Cliente("Silvio Julio",11242445560L,
               "Masculino","Rua A bloc 30","(71)99885-7799");


        //Saída dos dados do cliente
         cliente1.visualizar();

    }
}
