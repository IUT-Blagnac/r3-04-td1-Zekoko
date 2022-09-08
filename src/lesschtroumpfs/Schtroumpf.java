package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private boolean humeur;
	private Village village;
	
	public Schtroumpf(String nom, int age) {
		this.age = age;
		this.nom = nom;
		this.humeur = true;
		this.village = null;
	}
	
	public Schtroumpf() {
		this.nom = nom;
		this.age = age;
		this.humeur = humeur;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean estContent() {
		return this.humeur;
	}
	
	public String toString(){
		if (estContent()) {
			return "Je suis " + nom + ", j'ai " + age + " ans et je suis content";
		} else {
			return "Je suis " + nom + ", j'ai " + age + " ans et je ne suis PAS content";
		}
	}
		
	public void sePresenter() {
		System.out.println(toString());
	}
	
	public String leChant() {
		if (estContent()) {
			return "la, la, la Schtroumpf la, la";
		} else {
			return "gloups";
		}
	}
	
	public void chanter() {
		System.out.println(leChant());
	}
	
	public void anniversaire() {
		this.age = age + 1;
	}
	
	public void manger(int pfQte) {
		if (pfQte > 0) {
			this.humeur = true;
		}
	}
	
	public void allerTravailler() {
		this.humeur = false;
	}
}
