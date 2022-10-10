package Exercicio10;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente();
		
        c.nomeTitular = "Bruna";
		c.cpf = 6546546541l;
		c.numerodaConta = 6546541l;
		c.saldo = 1000.0;
		
		c.mostrarDados();
		
		c.depositar(50.0);
		c.sacar(200.0);
		
		c.mostrarDados();
	

}
}
