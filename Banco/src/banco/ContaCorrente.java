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
public class ContaCorrente extends Conta{
    private double limiteTotal;
    private Double limiteUtilizado;
    private Character tipo;
    
    public ContaCorrente(int idG,int idC, int nr, Double saldo,Character tipo){
        super(idG,idC, nr, saldo);
        this.tipo = Character.toUpperCase(tipo);
        switch (this.tipo) {
            case 'S':
                limiteTotal = 100d;
                break;
            case 'E':
                limiteTotal = 1000d;
                break;
            default:
                limiteTotal = 0;//tipo de conta invalido
                break;
        }
            
    }


    @Override
    public void depositar(Double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    @Override
    public void transferir(int nrBanco, int nrAgencia, int nrConta, Double valor) {
        
        //implementar depois
    }

    @Override
    public void alteraStatus(int nrG, boolean status) {
         if(super.getIdGerente() == nrG){
            super.setStatus(status);
            
        }
    }

    @Override
    public void sacar(int id, Double valor) {
        Double saldo = super.getSaldo();
        Double limiteDisponivel = limiteTotal - limiteUtilizado;
         if(super.getIdCliente()==id || valor >0){
            if(saldo>=valor){
                this.setSaldo(super.getSaldo()-valor);
            }
            else if(saldo + limiteDisponivel >= valor){
                valor -= saldo;
                super.setSaldo(0d);
                limiteUtilizado += valor;
                
            }
            else 
                 System.out.println("Saldo Insuficiente");
            
        }
        else{
            System.out.println("Saque não autorizado");
        }
    }

   
   
    
}
