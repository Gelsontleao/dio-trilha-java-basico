package projetos;

public class Main {

	public static void main(String[] args) {
		
		int intA = 1;
		int intB = intA;
		
		System.out.println("intA= " + intA + " intB= " + intB);
		intA = 2;
		System.out.println("intA= " + intA + " intB= " + intB);
		
		MeuObjeto objetoA = new MeuObjeto(1);
		MeuObjeto objetoB = objetoA;
		
		System.out.println("objetoA= " + objetoA + " objetoB= " + objetoB);
		
		objetoA.setNum(2);
		
		System.out.println("objetoA= " + objetoA + " objetoB= " + objetoB);
	}
}
