import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> jeu (int n, int type){
		ArrayList<Integer> resultats = new ArrayList<Integer>();
		ArrayList<Cercle> j = new ArrayList<Cercle>();
		double x,y;
		for(int i = 0 ; i < n ; i++){
			x = Math.random()*i;
			y = Math.random()*i;
			if (type == 0){
				j.add(new Cercle(x,y,1));
			}
			if (type == 1){
				j.add(new Cercle(x,y, Math.random()*Math.sqrt(i)));
			}
			if (type == 2){
				j.add(new Cercle(x,y,Math.random()*i));
			}
		}
		ToutesLesPaires test1 = new ToutesLesPaires();
		test1.addCercle(j);
		Balayage test2 = new Balayage();
		test2.addCercle(j);	
		
		//System.out.println("Croisement de TouteLesPaires");
		test1.comparaison();
		//System.out.println("\nCroisement de Balayage");
		test2.comparaison();
		
		resultats.add(test1.result.size());
		resultats.add(test2.result.size());
		
		return resultats;
	}
	
	public static void testGlobal(int n){
		int[][] moy = new int[3][2];
		for (int i = 0 ; i < 3 ; i++){
			moy[i][0]= 0;
			moy[i][1]= 0;
		}
		for (int i = 0 ; i < 1000 ; i++){
			ArrayList<Integer> val = new ArrayList<Integer>();
			for (int j = 0 ; j < 3 ; j++){
				val.addAll(jeu(n,j));
				moy[j][0]+=val.get(0);
				moy[j][1]+=val.get(1);
				val.clear();
			}
		}
		System.out.println("\nValeur moyenne du jeu 1 : (n = "+n+")\n - ToutesLesPaires : H(n) = "+moy[0][0]/1000+" ;\n - Balayage : H(n) = "+moy[0][1]/1000+" ;");
		System.out.println("\nValeur moyenne du jeu 2 : (n = "+n+")\n - ToutesLesPaires : H(n) = "+moy[1][0]/1000+" ;\n - Balayage : H(n) = "+moy[1][1]/1000+" ;");
		System.out.println("\nValeur moyenne du jeu 3 : (n = "+n+")\n - ToutesLesPaires : H(n) = "+moy[2][0]/1000+" ;\n - Balayage : H(n) = "+moy[2][1]/1000+" ;");
	}
	
	public static void main(String[] args) {
		//jeu(100,1);
		
		testGlobal(100);
		
		
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
		
		
		System.out.println("\nRésultat du balayage :");
		test2.comparaison();
		
		System.out.println("Jeu 1 ->  n = 6 ;\nToutesLesPaires : H(n) = "+test1.result.size()+" ;\nBalayage : H(n) = "+test2.result.size()+" ;");
		*/
	}
}