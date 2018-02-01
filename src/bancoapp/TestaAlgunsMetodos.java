/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

/**
 *
 * @author meumd
 */
public class TestaAlgunsMetodos {

    public static void main(String[] args) {
        // criando a conta
        Conta minhaConta = new Conta();
        minhaConta.titular.nome = "Duke";
        System.out.println(minhaConta.titular.nome);
    }
}