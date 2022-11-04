package generation.dadosclientes.model;

public class Cliente {

    private String nomeCompleto;
    private String sexo;
    private String endereco;
    private String contato;

    private int idade=0;


    public Cliente(String nomeCompleto, int idade, String sexo, String endereco, String contato) {
        this.nomeCompleto = nomeCompleto;
        this.idade=idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.contato = contato;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    public void visualizar(){

        System.out.println("| ************************************** |");
        System.out.println("|         DADOS DO CLIENTES              |");
        System.out.println("| ************************************** |");
        System.out.println("     Nome:" + this.getNomeCompleto()+"             ");
        System.out.println("     Idade:" + this.getIdade()+"                           ");
        System.out.println("     Gênero:" + this.sexo+"                   ");
        System.out.println("     Telefone:" + this.getContato()+"            ");
        System.out.println("     Endereço:" + this.getEndereco()+"  ");



    }
}
