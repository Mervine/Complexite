import java.util.ArrayList;

public class ToutesLesPaires {
	ArrayList<Cercle> l;
	ArrayList<ArrayList<Cercle>> result;
	long time;
	
	public ToutesLesPaires(){
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
	
	public void comparaison() {
		result.clear();
		long debut = System.nanoTime()/1000;
		int j;
		for(int i = 0 ; i < l.size() ; i++){
			ArrayList<Cercle> paire = new ArrayList<Cercle>();
			j = i + 1;
			while( j<l.size() ){
				if(distance(l.get(i),l.get(j)) < l.get(i).getRayon() + l.get(j).getRayon()){
					//System.out.println("Le cercle ["+ l.get(i).getNum() +"] croise ["+ l.get(j).getNum() +"]");
					paire.add(l.get(i));
					paire.add(l.get(j));
					result.add(paire);
				}
				j++;
			}
		}
		long fin = System.nanoTime()/1000;
		this.time = fin - debut;
	}

	
}
