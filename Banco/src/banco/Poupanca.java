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

   
    public void alteraStatus(int nrG, boolean status) {
        if(super.getIdGerente() == nrG){
            super.setStatus(status);
            
        }
    }

 
    public void sacar(int id, Double valor) {
        if(super.getIdCliente()==id){
            //pode sacar
        }
        else{
            System.out.println("Saque não autorizado");
        }
    }

    @Override
    public void depositar(Double valor) {
        
    }

    @Override
    public void transferir(int nrBanco, int nrAgencia, int nrConta, Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alteraStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sacar(Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
