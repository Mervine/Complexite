
public class Cercle implements Comparable<Cercle> {
	double x;
	double y;
	double rayon;
	static int i = 1;
	int num;
	
	public Cercle(double x, double y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
		this.num = i;
		i++;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRayon() {
		return rayon;
	}

	public int getNum() {
		return num;
	}

	public int compareTo(Cercle c) {
		if (c.getX()-c.getRayon() < this.getX()- this.getRayon()){
			return 1;
		}
		if (c.getX()-c.getRayon() > this.getX()- this.getRayon()){
			return -1;
		}
		return 0;
	}
	
	

}
