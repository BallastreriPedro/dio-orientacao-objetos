package construtores;

public class SistemaDeCadastro {
    public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("234.554.678-63", "Marcos");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
