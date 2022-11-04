
package generation.dadosclientes.model;


public class PessoaFisica extends Cliente {

    private long cpf;

    public PessoaFisica(String nomeCompleto, int idade, long cpf, String sexo, String endereco, String contato) {
        super(nomeCompleto, idade, sexo, endereco, contato);
        this.cpf = cpf;
    }


    public void PessoaFisica() {

    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){
        System.out.println("\n| =======================================|");
        System.out.println("|            PESSOA FISICA               |");
        super.visualizar();
        System.out.println("     CPF:"+getCpf()+"                    ");
        System.out.println("==========================================");
    }
}
