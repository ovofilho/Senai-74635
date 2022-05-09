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
public class Poupanca extends Conta{
    private int dataRendimento;
    
    public Poupanca(int idG, int idC,int nr, Double saldo){
        
        super(idG,idC,nr, saldo);
        dataRendimento = 1;
    }

   
    @Override
    public void alteraStatus(int nrG, boolean status) {
        if(super.getIdGerente() == nrG){
            super.setStatus(status);
            
        }
    }

 
    @Override
    public void sacar(int id, Double valor) {
        if(super.getIdCliente()==id || super.getSaldo()>=valor || valor >0){
            this.setSaldo(super.getSaldo()-valor);
            //pode sacar
        }
        else{
            System.out.println("Saque não autorizado");
        }
    }

    @Override
    public void depositar(Double valor) {
        if(valor >0) super.setSaldo(super.getSaldo() + valor);
        
    }

    @Override
    public void transferir(int nrBanco, int nrAgencia, int nrConta, Double valor) {
        //implementar depois
    }
   
}
