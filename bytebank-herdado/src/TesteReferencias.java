
public class TesteReferencias {

	public static void main(String[] args) {
		
		//g1 é do tipo funcionario 
		Gerente g1 = new Gerente();		
		g1.setNome("Fer");
		g1.setSalario(5000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1); 

		System.out.println(controle.getSoma());
		
	}

}
