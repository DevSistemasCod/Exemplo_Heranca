package entidade;

public class Gato extends Animal{
	
	 @Override
	  public void makeSound() {
	    System.out.println("The cat is barking");
	  }
	
	public static void metodo1() {
		System.out.println("saída metodo1 em Gato.");
	}
	
	public void metodo2() {
		System.out.println("saída metodo2 em Gato.");
	}
	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Animal animal = gato;
		Animal.metodo1();
		animal.metodo2();
	}
}
