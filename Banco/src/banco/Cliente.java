/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Cliente{
    private int id;
    private String nome;
    private int cpf;
    
    
    public void sacar(int conta, Double valor){
        
    }
    
    public Double consultarSaldo(int conta){
        Double valor = 0d;
        return valor;
    }
    
    public ResultSet extrato(int conta, Date inicio, Date fim){
        ResultSet rs = null;
        return rs;
    }
}
