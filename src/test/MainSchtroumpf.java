package test;

import lesschtroumpfs.Schtroumpf;
import lesschtroumpfs.Village;

public class MainSchtroumpf {

	public static void main (String[] argv) {
		Schtroumpf grognon;
		grognon = new Schtroumpf("Grognon", 135);
		grognon.sePresenter();
		grognon.chanter();
		grognon.allerTravailler();
		grognon.sePresenter();
		grognon.chanter();
		grognon.manger(10);
		grognon.sePresenter();
		grognon.chanter();
		grognon.anniversaire();
		grognon.sePresenter();
		grognon.chanter();
	}

}
