package br.ulbra.poo;

public class Funcionario {
    private String nomeFuncionario;
    private String cargo;
    private double valorHora;
    private double totalHora;
    private double desconto;
    public Funcionario(){
        this.nomeFuncionario = "Cadastrar novo Funcionário";
        this.cargo = "Indefinido";
        this.valorHora = 0;
        this.totalHora = 0;
        this.desconto = 0;
    
    }
    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;   
    }
     public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
     public double getValorHora(){
        return valorHora;
    }
    public void setValorHora( double valorHora){
        this.valorHora = valorHora;
    }
     public double getTotalHora(){
        return totalHora;
    }
    public void setTotalHora( double totalHora){
        this.totalHora = totalHora;
    }
     public double getDescontos(){
        return desconto;
    }
    public void setDescontos( double desconto){
        this.desconto = desconto;
    }
    public void calcularSalarioLiquido(){
        double salarioBruto, salarioLiquido;
        salarioBruto = this.valorHora*this.totalHora;
        salarioLiquido = salarioBruto - desconto;
        System.out.println("Salário liquido é R$ "+salarioLiquido);
    }
}
