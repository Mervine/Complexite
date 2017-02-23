
public class Main {

	public static void main(String[] args) {


		/*ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(new Cercle (3,3,2));
		test1.addCercle(new Cercle (4,7,3));
		test1.addCercle(new Cercle (10,5,4));
		test1.addCercle(new Cercle (6,3,2));
		test1.addCercle(new Cercle (8,12,1));
		test1.addCercle(new Cercle (9,13,1));
		
		System.out.println("Résultat de la comparaison par paire :");
		test1.comparaison();*/
		
		
		
		Balayage test2 = new Balayage();
		test2.addCercle(new Cercle (3,3,2));
		test2.addCercle(new Cercle (4,7,3));
		test2.addCercle(new Cercle (10,5,4));
		test2.addCercle(new Cercle (6,3,2));
		test2.addCercle(new Cercle (8,12,1));
		test2.addCercle(new Cercle (9,13,1));
		
		test2.triParTas();
		
		System.out.println("Résultat du tri par tas :");
		for(Cercle c:  test2.l){
			System.out.println(c.num);
		}

	}

}
