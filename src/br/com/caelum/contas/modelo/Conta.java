package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as contas do banco
 *
 * @author Samuel Nascimento Filho
 */

public abstract class Conta implements Comparable<Conta> {
    // Atributos globais
    private static int numeroDeContas;

    //Atributos locais
    protected String titular;
    private int numeroAgencia;
    private int numeroConta;
    private Data dataAbertura = new Data();
    protected double saldo;
    private double limite;

    // Construtor
    public Conta(){
        // Incrementa o total de contas criadas
        Conta.numeroDeContas++;
        // Seta o dia de abertura
        this.dataAbertura.dia = 20;
        this.dataAbertura.mes = 8;
        this.dataAbertura.ano = 2016;
    }

    // Metodos

    /**
     * Método responsável por retirar um saldo da conta
     * @param quantidade
     */
    public void sacaDinheiro(double quantidade){
        if(quantidade > this.saldo)
            throw new IllegalArgumentException("Saldo insuficiente.");
        else if (quantidade < 0)
            throw new IllegalArgumentException("Não é possível sacar uma quantidade negativa.");
        else
            this.saldo -= quantidade;
    }

    /**
     * Método responsável por depositar um saldo na conta
     * @param quantidade
     */
    public void depositaDinheiro(double quantidade){
        if(quantidade < 0)
            throw new IllegalArgumentException("Não é possível depositar um valor negativo.");
        else {
            this.saldo += quantidade;
        }
    }

    /**
     * Efetua a transferência entre contas
     *
     */
    public boolean transfereDinheiro(double quantidade, Conta contaDeDestino){
        try {
            this.sacaDinheiro(quantidade);
            contaDeDestino.depositaDinheiro(quantidade);
            return true;
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }


    /**
     * Método responsável por retornar os dados da conta para impressão
     * @return String com os dados da conta
     */
    public String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero da agencia: " + this.numeroAgencia;
        dados += "\nNúmero da conta: " + this.numeroConta;
        dados += "\nData de abertura: " + this.dataAbertura.dia + "/" + this.dataAbertura.mes + "/" + this.dataAbertura.ano;
        dados += "\nSaldo atual: " + this.saldo;
        dados += "\nLimite disponível: " + this.limite + "\n";

        return dados;
    }

    public abstract String getTipo();

    @Override
    public String toString(){
        return "[Titular: " + titular.toUpperCase() + ", numero: " + numeroConta + ", agencia: " + numeroAgencia + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;

        Conta outraConta = (Conta) obj;

        return this.numeroConta == outraConta.numeroConta && this.numeroAgencia == outraConta.numeroAgencia;
    }


    // Getters e Setters
    public static int getNumeroDeContas() {
        return numeroDeContas;
    }

    public String getTitular() {
        return titular;
    }

    public int getAgencia() {
        return numeroAgencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getRendimento() {
        return saldo * 0.1;
    }

    public static void setNumeroDeContas(int numeroDeContas) {
        Conta.numeroDeContas = numeroDeContas;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}












