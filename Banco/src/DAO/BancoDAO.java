/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class BancoDAO {
    Connection conn;
    PreparedStatement pstm;
    String sql = null;
    
    public void cadastrarCliente(String nome, int cpf){
        sql = "insert into cliente (nome, cpf) values (?,?)";
        conn = new Conexao().conectarDAO();
        try {
            pstm = conn.prepareCall(sql);
            pstm.setString(1, nome);
            pstm.setInt(2, cpf);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente " +  e);
        }
    }
    public void cadastrarGerente(String nome){
        sql = "insert into Gerente (nome) values (?)";
        conn = new Conexao().conectarDAO();
        try {
            pstm = conn.prepareCall(sql);
            pstm.setString(1, nome);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente " +  e);
        }
    }
    public void cadastrarConta(int tp, int idG, int idC, int nr, double saldo, boolean ativo, String dt){
        sql = "insert into ? (idgerente, idcliente, numero, saldo, ativo, dtrendimento) values (?,?,?,?,?,?,?)";
        conn = new Conexao().conectarDAO();
        try {
            pstm = conn.prepareCall(sql);
            pstm.setInt(1, tp);
            pstm.setInt(2, idG);
            pstm.setInt(3, idC);
            pstm.setInt(4, nr);
            pstm.setDouble(5, saldo);
            pstm.setBoolean(6, ativo);
            pstm.setString(7, dt);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente " +  e);
        }
    }
}
