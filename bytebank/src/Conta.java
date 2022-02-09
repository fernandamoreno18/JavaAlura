public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
	//void, quando metodo nao retorna nada	
	}
	
	//esse metodo tem um retorno de true ou false;
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
}