package generation.dadosfuncionario.model;

public class Vendedor extends Funcionario{

    private float salario;

    public Vendedor(long matricula, String nomeCompleto, long rg, int idade, String cargo, String funcao, String setor,float salario) {
        super(matricula, nomeCompleto, rg, idade, cargo, funcao, setor);
        this.salario = salario;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void visualizar(){
        System.out.println("\n|================================================|");
        System.out.println("|             EMPRESA ZXD TECH                   |");
        System.out.println("|================================================|");
        super.visualizar();
        System.out.println("        Salário: "+getSalario()+"                  ");
        System.out.println("==================================================");
    }
}
