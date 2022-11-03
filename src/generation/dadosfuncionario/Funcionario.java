package generation.dadosfuncionario;

public class Funcionario {

    private long matricula;
    private String nomeCompleto;
    private String cargo;
    private String funcao;
    private String setor;

    public Funcionario(long matricula, String nomeCompleto, String cargo, String funcao, String setor) {

        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cargo = cargo;
        this.funcao = funcao;
        this.setor = setor;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void visualizar(){
        System.out.println("\n| ***********************************************|");
        System.out.println("|          API TECLOGE DESENVOLVIMENTO           |");
        System.out.println("|================================================|");
        System.out.println("|             DADOS DO FUNCIONÁRIO               |");
        System.out.println("| ***********************************************|");
        System.out.println("|       Nome: " + this.getNomeCompleto()+"                 |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|       Matrícula: " + this.matricula+"                         |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|       Cargo: " + this.cargo+"                |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|       Função: "+ this.funcao+"    |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|       Setor: " + this.setor+"          |");
        System.out.println("| ***********************************************|");
    }
}
