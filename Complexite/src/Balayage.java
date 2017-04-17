import java.util.ArrayList;
import java.util.Collections;

public class Balayage {
	ArrayList<Cercle> l;
	ArrayList<ArrayList<Cercle>> result;
	long time;
	
	public Balayage(){
		l = new ArrayList<Cercle>();
		result = new ArrayList<ArrayList<Cercle>>();
	}
	
	public void addCercle(Cercle c){
		l.add(c);
	}
	
	public void addCercle(ArrayList<Cercle> c) {
		l.addAll(c);
	}
	
	public double distance(Cercle c1, Cercle c2){
		return Math.sqrt( Math.pow(c2.getX()- c1.getX(), 2) + Math.pow(c2.getY()- c1.getY(), 2) );
	}
	
	public void trier (){
		Collections.sort(l);
	}
	
	public void comparaison(){
		long debut = System.nanoTime()/1000;
		
		result.clear();
		trier();
		for(int i = 0 ; i < l.size() ; i++){
			ArrayList<Cercle> paire = new ArrayList<Cercle>();
			for(int j = i+1 ; j < l.size() ; j++){
				if(l.get(j).x - l.get(j).rayon > l.get(i).x + l.get(i).rayon  ){
					j = l.size();
				}
				else{
					//Tester si les disques se croisent
					if(distance(l.get(i),l.get(j)) < l.get(i).getRayon() + l.get(j).getRayon()){
						//System.out.println("Le cercle ["+ l.get(i).getNum() +"] croise ["+ l.get(j).getNum() +"]");
						paire.add(l.get(i));
						paire.add(l.get(j));
						result.add(paire);
					}	
				}
			}
		}
		long fin = System.nanoTime()/1000;
		this.time = fin - debut;
	}
}
