package generation.dadosclientes;

public class Cliente {

    private String nomeCompleto;
    private long cpf;
    private String sexo;
    private String endereco;
    private String contato;


    public Cliente(String nomeCompleto, long cpf, String sexo, String endereco, String contato) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
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
        System.out.println("\n| ************************************** |");
        System.out.println("|        DADOS DO CLIENTES               |");
        System.out.println("| ************************************** |");
        System.out.println("|       Nome:" + this.getNomeCompleto()+"                |");
        System.out.println("|       Gênero:" + this.sexo+"                 |");
        System.out.println("|       CPF:" + this.getCpf()+"                  |");
        System.out.println("|       Telefone:" + this.getContato()+"          |");
        System.out.println("|       Endereço:" + this.getEndereco()+"           |");
        System.out.println("| ************************************** |");
    }
}
