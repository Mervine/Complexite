import java.util.ArrayList;

public class Main {

	public static void jeu1 (int n){
		ArrayList<Cercle> j1 = new ArrayList<Cercle>();
		double x,y;
		for(int i = 0 ; i < n ; i++){
			x = Math.random()*i;
			y = Math.random()*i;
			j1.add(new Cercle(x,y,1));
		}
		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(j1);
		Balayage test2 = new Balayage();
		test2.addCercle(j1);	
		
		System.out.println("Croisement de TouteLesPaires");
		test1.comparaison();
		System.out.println("\nCroisement de Balayage");
		test2.comparaison();
		
		System.out.println("\nJeu 1 ->  n = "+n+" ;\nToutesLesPaires : H(n) = "+test1.result.size()+" ;\nBalayage : H(n) = "+test2.result.size()+" ;");
	}
	
	public static void jeu2 (int n){
		ArrayList<Cercle> j2 = new ArrayList<Cercle>();
		double x,y,r;
		for(int i = 0 ; i <= n ; i++){
			x = Math.random()*i;
			y = Math.random()*i;
			r = Math.random()*Math.sqrt(n);
			j2.add(new Cercle(x,y,r));
		}
		
		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(j2);
		Balayage test2 = new Balayage();
		test2.addCercle(j2);
		
		test1.comparaison();
		test2.comparaison();
		
		System.out.println("Jeu 2 ->  n = "+n+" ;\nToutesLesPaires : H(n) = "+test1.result.size()+" ;\nBalayage : H(n) = "+test2.result.size()+" ;");
	}

	public static void jeu3 (int n){
		ArrayList<Cercle> j3 = new ArrayList<Cercle>();
		double x,y,r;
		for(int i = 0 ; i <= n ; i++){
			x = Math.random()*i;
			y = Math.random()*i;
			r = Math.random()*i;
			j3.add(new Cercle(x,y,r));
		}
		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(j3);
		Balayage test2 = new Balayage();
		test2.addCercle(j3);
	
		test1.comparaison();
		test2.comparaison();
		
		System.out.println("Jeu 3 ->  n = "+n+" ;\nToutesLesPaires : H(n) = "+test1.result.size()+" ;\nBalayage : H(n) = "+test2.result.size()+" ;");
	}
	
	
	public static void main(String[] args) {
		jeu1(100);

		/*ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(new Cercle (3,3,2));
		test1.addCercle(new Cercle (4,7,3));
		test1.addCercle(new Cercle (10,5,4));
		test1.addCercle(new Cercle (6,3,2));
		test1.addCercle(new Cercle (8,12,3));
		test1.addCercle(new Cercle (9,13,1));
		
		System.out.println("Résultat de la comparaison par paire :");
		test1.comparaison();
		
		Cercle.i = 1;
		
		Balayage test2 = new Balayage();
		test2.addCercle(new Cercle (3,3,2));
		test2.addCercle(new Cercle (4,7,3));
		test2.addCercle(new Cercle (10,5,4));
		test2.addCercle(new Cercle (6,3,2));
		test2.addCercle(new Cercle (8,12,3));
		test2.addCercle(new Cercle (9,13,1));
		
		
		
		test2.triParTas();
		
		for (int i = 0 ; i < test1.l.size() ; i++){
			System.out.println(test2.l.get(i).num+" /// "+(test2.l.get(i).getX()-test2.l.get(i).getRayon()));
		}
		System.out.println("");
		System.out.println("Résultat du balayage :");
		test2.comparaison();
		
		System.out.println("Jeu 1 ->  n = 6 ;\nToutesLesPaires : H(n) = "+test1.result.size()+" ;\nBalayage : H(n) = "+test2.result.size()+" ;");
		*/

	}

}
