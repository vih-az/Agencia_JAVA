package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private long cpf, rg, telefone;
    Scanner scanner = new Scanner(System.in);
    List<Cliente> listCliente = new ArrayList<>();

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente: listCliente){
            long cpfPesquisado = cliente.getCpf();
            if (cpfPesquisado==cpf){
                return cliente;
            }
        }
        return null;
    }
    public void listarClientes(){
        for(Cliente cliente: listCliente){
            System.out.println(cliente.getNome());
        }
    }
    public void adicionarCliente(Cliente cliente){
        listCliente.add(cliente);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }


    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getRg() {
        return rg;
    }


    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getTelefone() {
        return telefone;
    }


    public void cadastrarCliente(){
        System.out.println("   ----  Cadastro cliente  ----   ");
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe seu telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("   -----------------------------  ");
    }
}
