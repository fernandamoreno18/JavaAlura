
public class Gerente extends Funcionario {

	private int senha;
	
	
	public Gerente() {
		
	}
	
	public boolean antentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	//pode ser criado um get sem ter um atributo para ele.
	public double getBonificacao() {
		//super - vem da classe pai - superclass
		//return super.salario;
		
		//reaproveitar o metodo da super classe e adicionar o salario
		//utilizando o get salario, pois a variavel é privada e nao é possivel pegar ela em si, por isso usamos
		//o get para pegar e o set para modificar
		return super.getBonificacao() + super.getSalario();
	}
	
}
