package generation.dadosfuncionario.model;

public class Funcionario {

    private long matricula;
    private String nomeCompleto;
    private long rg;
    private int idade;
    private String cargo;
    private String funcao;
    private String setor;

    public Funcionario(long matricula, String nomeCompleto, long rg, int idade, String cargo, String funcao, String setor) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.idade = idade;
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

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        System.out.println("|================================================|");
        System.out.println("|             DADOS DO FUNCIONÁRIO               |");
        System.out.println("|================================================|");
        System.out.println("         Nome: " + this.getNomeCompleto()+"                 ");
        System.out.println("------------------------------------------------");
        System.out.println("         RG: " + this.getRg() +"                         ");
        System.out.println("------------------------------------------------");
        System.out.println("         Idade: "+ this.getIdade()+"                        ");
        System.out.println("------------------------------------------------");
        System.out.println("        Matrícula: " + this.matricula+"                         ");
        System.out.println("------------------------------------------------");
        System.out.println("        Cargo: " + this.cargo+"                ");
        System.out.println("------------------------------------------------");
        System.out.println("        Função: "+ this.funcao+"    ");
        System.out.println("------------------------------------------------");
        System.out.println("        Setor: " + this.setor+"          ");
        System.out.println("------------------------------------------------");

    }
}
