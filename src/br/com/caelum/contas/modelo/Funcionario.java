package br.com.caelum.contas.modelo;

public abstract class Funcionario {

    // Atributos
    protected String nome;
    protected String cpf;
    protected double salario;

    //Métodos
    public abstract double getBonificacao();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
