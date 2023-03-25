
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaLeila = new Conta();
		contaDaLeila.deposita(100000);
		System.out.println(contaDaLeila.getSaldo());
		
		contaDaLeila.titular = new Cliente();
		System.out.println(contaDaLeila.titular);
		
		contaDaLeila.titular.nome = "Leila Alice de Oliveira Vale";
		System.out.println(contaDaLeila.titular.nome);

	}

}
