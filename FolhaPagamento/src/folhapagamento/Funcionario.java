/**
 * @author Roniel Nunes
 */
package folhapagamento;

public class Funcionario {
    protected String nome;
    protected String dataNascimento;
    private String tipoContrato; //Efetivo ou horista
    private float salario;
    private int numFilhosMenoresIdade;
    protected String dataAdmissao;
    

    
    //Metodo construtor(construct)
    public Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    //Metodos Especiais(sett e get)

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getNumFilhosMenoresIdade() {
        return numFilhosMenoresIdade;
    }

    public void setNumFilhosMenoresIdade(int numFilhosMenoresIdade) {
        this.numFilhosMenoresIdade = numFilhosMenoresIdade;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    
    //Metodos personalizados
    public void contratar(String tipoContrato, float salario, int numFilhosMenoresIdade, String dataAdmissao){
        this.setTipoContrato(tipoContrato);
        this.setSalario(salario);
        this.setNumFilhosMenoresIdade(numFilhosMenoresIdade);
        this.setDataAdmissao(dataAdmissao);
    }
    
    public float calculaSalarioBruto(float horas){
        if(this.getTipoContrato().equals("Horista")){
            return this.getSalario()*horas;
        }else{
            return this.getSalario();
        }
    }
    
    public float calculaDescontoINSS(){
        if(this.getSalario() <= 1659.38){
            return (this.getSalario()*0.08f);
        }else if(this.getSalario() > 1659.38 && this.getSalario() <=2765.66){
            return (this.getSalario()*0.9f);
        }else if(this.getSalario() > 2765.66 && this.getSalario() <= 5531.31){
            return (this.getSalario()*0.11f);
        }else if(this.getSalario() > 5531.31){
            return this.getSalario()*0.11f;
        }
        return (float)(5531.31*0.11);//608.44f;
    }
    
    public float calculaDescontoImpostoRenda(){
        if(this.getSalario() <= 1903.98){
            return 0f;
        }else if(this.getSalario() >1903.98 && this.getSalario() <= 2826.65 ){
            return (float)(this.getSalario()*0.075);
        }else if(this.getSalario() > 2826.65 && this.getSalario() <= 3751.06){
            return (float)(this.getSalario()*0.15);
        }else if(this.getSalario() > 3751.06 && this.getSalario() <= 4664.68 ){
            return (float)(this.getSalario()*0.225);    
        }
        return (float)(this.getSalario()*0.275);  
    }
    public float calculaSalarioLiquido(){
        return (this.getSalario() - this.calculaDescontoINSS() - this.calculaDescontoImpostoRenda());
    }
    
    public void folhaPagamento(float horas){
        System.out.println("---------Funcionário----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Tipo de contrato: " + this.getTipoContrato());
        System.out.println("Salário Bruto: " + this.calculaSalarioBruto(horas));
        System.out.println("Desconto INSS: " + this.calculaDescontoINSS());
        System.out.println("Desconto imposto de renda: " + this.calculaDescontoImpostoRenda());
        System.out.println("Salário liquido: " + this.calculaSalarioLiquido());
        System.out.println("Quantidade de filhos menor de idade: " + this.getNumFilhosMenoresIdade());
        
    }
}
