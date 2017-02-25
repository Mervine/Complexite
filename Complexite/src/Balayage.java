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
		Cercle echange;
		int k = i;
		int j = 2*k;
		while ( j < longueur ){
			if (j < longueur && l.get(j).x - l.get(j).rayon < l.get(k).x - l.get(k).rayon){
				j++;
			}
			if ( l.get(k).x - l.get(k).rayon < l.get(j).x - l.get(j).rayon){
				//échanger
				echange=l.get(k);
				l.set(k, l.get(j));
				l.set(j, echange);
				
				
				k=j;
				j=2*k;
			}
			else{j=longueur;}
		}
	}
	
	public void triParTas(){
		Cercle echange;
		for(int i = (l.size()-1)/2 ; i >= 0 ; i--){
			tamiser(i, l.size()-1);
		}
		for(int i = l.size()-1 ; i > 1 ; i--){
			//échanger
			echange=l.get(i);
			l.set(i, l.get(1));
			l.set(1, echange);
			
			tamiser(1, i-1);
		}
	}
	
	public double distance(Cercle c1, Cercle c2){
		return Math.sqrt( Math.pow(c2.getX()- c1.getX(), 2) + Math.pow(c2.getY()- c1.getY(), 2) );
	}
	
	public void comparaison(){
		for(int i = 0 ; i < l.size() ; i++){
			for(int j = i+1 ; j < l.size() ; j++){
				if(l.get(j).x - l.get(j).rayon > l.get(i).x + l.get(i).rayon  ){
					j = l.size();
				}
				else{
					//Tester si les disques se croisent
					if(distance(l.get(i),l.get(j)) < l.get(i).getRayon() + l.get(j).getRayon()){
						System.out.println("Le cercle ["+ l.get(i).getNum() +"] croise ["+ l.get(j).getNum() +"]");
					}	
				}
			}
		}
	}
}
