/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Aluno
 */
public interface Iconta {
    public void sacar(int id, Double valor);
    public void depositar(Double valor);
    public void transferir(int nrBanco, int nrAgencia, int nrConta, Double valor);
    
    
    
}
