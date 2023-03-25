
public class TestaBanco {
	public static void main(String[] args) {
		Cliente anna = new Cliente();
		anna.nome = "Anna Carolina de Oliveira Vale Mendes";
		anna.cpf = "134.606.227-76";
		anna.profissao = "Analista e Desenvolvedora de Sistemas";
		
		Conta contaDaAnna = new Conta();
		contaDaAnna.deposita(100);
		
		//associa a cliente anna a contaDaAnna
		contaDaAnna.titular = anna;
		System.out.println("Nome : " + contaDaAnna.titular.nome);
		System.out.println("CPF: " + contaDaAnna.titular.cpf);
		System.out.println("Profissão: " + contaDaAnna.titular.profissao);
		System.out.println("Vai aparecer o ID de referencia: " + contaDaAnna.titular);
		System.out.println("Vai aparecer o ID de referencia: " + anna);
	}
}
