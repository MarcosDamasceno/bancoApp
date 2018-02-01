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
public class Conta {

    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    
    boolean transferePara(Conta destino, double valor) {
        if(!this.saca(valor)){
            // não deu pra sacar!
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }

    }
}
