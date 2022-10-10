package Exercicio10;

public class ContaCorrente {

	
    public String nomeTitular;
    public Long cpf;
    public Long numerodaConta;
    public Double saldo;
    
    public void depositar(Double valorDeposito) {
    	saldo = saldo + valorDeposito;
    }
    
    public Double sacar(Double valorSaque) {
    	
    	double retornoSaque = 0;
    	if(valorSaque > saldo) {
    		System.out.println("Saldo insuficiente!");
    	}else {
    		saldo = saldo - valorSaque;
    		retornoSaque = valorSaque;
    	}
    	return retornoSaque;
    }
    
    public void mostrarDados() {
    	System.out.println("Titular:" + nomeTitular);
    	System.out.println("Cpf:" + cpf);
    	System.out.println("Conta:" + numerodaConta);
    	System.out.println("saldo Conta:" + saldo);
    }
    
    
}
