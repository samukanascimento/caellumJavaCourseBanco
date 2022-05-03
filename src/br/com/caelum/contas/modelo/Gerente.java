package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    /*public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }*/

    public boolean autentica(int senha){
        if(senha == this.senha){
            System.out.println("Acesso permitido!");
            return true;
        }
        else{
            System.out.println("Acesso negado!");
            return false;
        }
    }

    // Métodos
    @Override
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }

    // Getters e Setters
    public int getSenha() {
        return senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
