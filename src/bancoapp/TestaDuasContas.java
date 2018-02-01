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
public class TestaDuasContas {
    public static void main(String[] args){
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.saldo = 1000;
        
        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;
    }
    
}
