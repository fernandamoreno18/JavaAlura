
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //cria um objeto do tipo conta 
		
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
	}

}