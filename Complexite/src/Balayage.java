import java.util.ArrayList;

public class Balayage {
	ArrayList<Cercle> l;
	
	public Balayage(){
		l = new ArrayList<Cercle>();
	}
	
	public void addCercle(Cercle c){
		l.add(c);
	}
	
	public void tamiser(int i, int longueur){
		Cercle change;
		int k = i;
		int j = 2*k;
		while ( j < longueur ){
			if (j < longueur && l.get(j).x < l.get(k).x){
				j++;
			}
			if ( l.get(k).x < l.get(j).x){
				//échanger
				change=l.get(k);
				l.set(k, l.get(j));
				l.set(j, change);
				
				
				k=j;
				j=2*k;
			}
			else{j=longueur;}
		}
	}
	
	public void triParTas(){
		Cercle change;
		for(int i = (l.size()-1)/2 ; i >= 0 ; i--){
			tamiser(i, l.size()-1);
		}
		for(int i = l.size()-1 ; i > 1 ; i--){
			//échanger
			change=l.get(i);
			l.set(i, l.get(1));
			l.set(1, change);
			
			tamiser(1, i-1);
		}
	}

}
