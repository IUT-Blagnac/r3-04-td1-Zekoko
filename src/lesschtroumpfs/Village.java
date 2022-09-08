package lesschtroumpfs;


public class Village {
	private String nom;
	private Schtroumpf[] Tab;
	private int nbSchtroumpfs;
	private int stock;
	
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.Tab = new Schtroumpf[100];
		for(int i = 0; i < pfNomsDesSchtroumpfs.length; i ++) {
			this.Tab[i] = new Schtroumpf(pfNomsDesSchtroumpfs[i], (int)(Math.random()*150));
			this.nbSchtroumpfs ++;
		}
		this.nom = pfNomV;
		this.stock = pfStockSalsepareille;
	}
	
	
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbSchtroumpfs() {
		return this.nbSchtroumpfs;
	}
	
	public int getStockSalsepareille() {
		return this.stock;
	}
	
	public void solstice_d_ete() {
		for(int i = 0; i<this.getNbSchtroumpfs(); i++) {
			Tab[i].sePresenter();
			Tab[i].chanter();
		}
		getNbSchtroumpfs();
		int content = 0;
		for(int i = 0; i<this.getNbSchtroumpfs(); i++) {
			if(Tab[i].estContent()) {
				content ++;
			}
		}
		System.out.println(content + " Schtroumpfs étaient contents ce jour là.");
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf chef = Tab[0];
		for(int i = 0; i <this.getNbSchtroumpfs(); i++) {
			if(Tab[i].getAge() > chef.getAge()) {
				chef = Tab[i];
			}
		}
		System.out.println("Voici le chef du village :");
		return chef;	
	}
	
	public void envoyerAuTravail() {
		for(int i = 0; i < this.getNbSchtroumpfs(); i = i + 2) {
			Tab[i].allerTravailler();
			}	
		System.out.println("Les schtroumpfs sont partis travailler");
		}
	
	public void schtroumpfsHeureux() {
		for(int i = 0; i < this.getNbSchtroumpfs(); i = i++) {
			if(Tab[i].estContent() == true) {
				Tab[i].sePresenter();
				Tab[i].chanter();
			}
		}
	}
}
