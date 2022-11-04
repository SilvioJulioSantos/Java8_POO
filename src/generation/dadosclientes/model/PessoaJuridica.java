package generation.dadosclientes.model;


public class PessoaJuridica extends Cliente{

    private String cnpj;
    private String nomeEmpresa;

    public PessoaJuridica(String nomeEmpresa  ,String nomeCompleto, int idade, String sexo, String endereco, String contato, String cnpj) {
        super(nomeCompleto, idade, sexo, endereco, contato);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj=cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar(){
        System.out.println("\n| =======================================|");
        System.out.println("|          PESSOA JURIDICA               |");
        System.out.println("| =======================================|");
        System.out.println("     Empresa:"+getNomeEmpresa()+"                  ");
        System.out.println("     CNPJ:"+getCnpj()+"                    ");
        super.visualizar();
        System.out.println("==========================================");
    }
}
