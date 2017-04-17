import java.io.File;
import java.io.FileWriter;
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
		
		test1.comparaison();
		test2.comparaison();
		
		//resultats.add(test1.result.size());
		//resultats.add(test2.result.size());
		
		resultats.add((int) test1.time);
		resultats.add((int) test2.time);
		
		return resultats;
	}
	
	public static String testGlobal(int n){
		int[][] moy = new int[3][2];
		for (int i = 0 ; i < 3 ; i++){
			moy[i][0]= 0;
			moy[i][1]= 0;
		}
		for (int i = 0 ; i < 500 ; i++){
			ArrayList<Integer> val = new ArrayList<Integer>();
			for (int j = 0 ; j < 3 ; j++){
				val.addAll(jeu(n,j));
				moy[j][0]+=val.get(0);
				moy[j][1]+=val.get(1);
				val.clear();
			}
		}
		
		return moy[0][0]/500+" "+moy[0][1]/500+" "+moy[1][0]/500+" "+moy[1][1]/500+" "+moy[2][0]/500+" "+moy[2][1]/500;
		
	}
	
	public static void main(String[] args) {
		
		try{
			
			File ff=new File("resultat.txt"); // définir l'arborescence
			ff.createNewFile();
			
			FileWriter ffw=new FileWriter(ff);
			
			ffw.write("nDisque jeu1_TTP jeu1Bal jeu2_TTP jeu2Bal jeu3_TTP jeu3Bal");
			
			for (int i = 1 ; i <= 2580 ; i++){
				System.out.println("Etape : "+i);
				ffw.write("\n");
				ffw.write(i+" "+testGlobal(i));
			}
			ffw.close(); // fermer le fichier à la fin des traitements
		} catch (Exception e) {}
		
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