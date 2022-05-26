package vintecincomaio;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();

		pessoa.setNome("Adao");
		pessoa.setIdade(42);

		pessoa2.setNome("Maria");
		pessoa2.setIdade(21)
		
		

		System.out.println("mostrando pelo acesso direto set e get : ");
		System.out.println("nome da pessoa1  : " + pessoa.getNome());
		System.out.println("idade da pessoa1 : " + pessoa.getIdade());

		System.out.println("---------------------------");
		System.out.println("mostrando pelo to string : ");
		System.out.println(pessoa);
 
		System.out.println("---------------------------");
		
		System.out.println("comparando com equals : ");
		if (pessoa.equals(pessoa2)) {
			System.out.println("pessoas iguais ");
		} else {
			System.out.println("pessoas diferentes");
		}
		
		System.out.println("---------------------------");

		System.out.println("comparando com hashcode : ");
		
		if (pessoa.hashCode() == pessoa2.hashCode()) {
			System.out.println("pessoas iguais ");
		} else {
			System.out.println("pessoas diferentes");
		}

	}

}
