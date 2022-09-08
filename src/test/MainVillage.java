package test;

import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur à lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf étonné", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		Village village;
		village = new Village("BleuVille", 100, nomsSchtroumpfs);
		village.getNom();
		village.getNbSchtroumpfs();
		village.getStockSalsepareille();
		village.solstice_d_ete();
		village.chefDuVillage().sePresenter();
		village.envoyerAuTravail();
		village.schtroumpfsHeureux();
	}

}
