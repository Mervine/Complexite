
public class Main {

	public static void main(String[] args) {

// test 1
		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(new Cercle (3,3,2));
		test1.addCercle(new Cercle (4,7,3));
		test1.addCercle(new Cercle (10,5,4));
		test1.addCercle(new Cercle (6,3,2));
		test1.addCercle(new Cercle (8,12,3));
		test1.addCercle(new Cercle (9,13,1));
		
		System.out.println("R�sultat de la comparaison par paire :");
		test1.comparaison();
		
		Cercle.i = 1;
		
		Balayage test2 = new Balayage();
		test2.addCercle(new Cercle (3,3,2));
		test2.addCercle(new Cercle (4,7,3));
		test2.addCercle(new Cercle (10,5,4));
		test2.addCercle(new Cercle (6,3,2));
		test2.addCercle(new Cercle (8,12,3));
		test2.addCercle(new Cercle (9,13,1));
		
		System.out.println("");
		System.out.println("R�sultat du balayage :");
		test2.comparaison();
		
// faire d'autres tests

	}

}
