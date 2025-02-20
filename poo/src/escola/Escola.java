package escola;

public class Escola {
    public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Junior");
		felipe.setIdade(12);

        Aluno larissa = new Aluno();
        larissa.setNome("Larissa Almeida");
        larissa.setIdade(13);

		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        System.out.println("A aluna " + larissa.getNome() + " tem " + larissa.getIdade()+ " anos ");

	}
}
