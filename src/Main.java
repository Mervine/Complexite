
public class Main {

	public static void main(String[] args) {


		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(new Cercle (3,3,2));
		test1.addCercle(new Cercle (4,7,3));
		test1.addCercle(new Cercle (10,5,4));
		test1.addCercle(new Cercle (6,3,2));
		test1.addCercle(new Cercle (8,12,1));
		test1.addCercle(new Cercle (9,13,1));
		
		test1.comparaison();

	}

}
