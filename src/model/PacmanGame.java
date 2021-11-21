package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import engine.Case;
import engine.Cmd;
import engine.Game;
import engine.Hero;

import java.time.Instant;

//Version avec personnage qui peut se deplacer. A completer dans les versions suivantes.
public class PacmanGame implements Game {
	private int NombreCle=0;
	private static Instant TempsDepart=Instant.now();
	private static long TempsMax=2000; //C'est en nano secondes
	

	//constructeur avec fichier source pour le help
	public PacmanGame(String source) {
		BufferedReader helpReader;
		try {
			helpReader = new BufferedReader(new FileReader(source));
			String ligne;
			while ((ligne = helpReader.readLine()) != null) {
				System.out.println(ligne);
			}
			helpReader.close();
		} catch (IOException e) {
			System.out.println("Help not available");
		}
	}

	//faire evoluer le jeu suite a une commande @param commande
	@Override
	public void evolve(Cmd commande) {
		System.out.println("Execute "+commande);
		System.out.println("Execute "+Hero.getAbscisse()+Hero.getOrdonnee());
		Hero.move(commande);
	}
	
	public static boolean check(int abscisse,int ordonnee) {	// checker si la case n'est pas occupée par un mur
		if (Integer.parseInt(PacmanPainter.getLabyrinthe()[abscisse][ordonnee])==0) {
			return true;
		}
		return false;
	}
	
	public boolean possedeCle() {
		if (NombreCle!=0) {
			return true;
		}
		return false;
	}
	
	public static long GetTime() {
		Instant TempsEcoule= Instant.now();
		long TempsEcouleconverti = TempsEcoule.toEpochMilli();
		long TempsDepartconverti = TempsDepart.toEpochMilli();
		return (TempsEcouleconverti-TempsDepartconverti);
	}
	public static boolean OkTime() {
		if (GetTime()<=TempsMax){
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	public void AjoutCle(int x, int y) {		// pas utile finalement: mis dans finJeu
		if (Case.verifCle(x,y)==true) {
			NombreCle+=1;
		}
	}						// à enlever: la clé du plateau
	*/


	//verifier si le jeu est fini
	
	@Override
	public boolean finJeu() {
		/*
		while(OkTime()) {
			if(possedeCle()) {
				if(Case.verifArrivee(Hero.getAbscisse(),Hero.getOrdonnee())) {
					System.out.println("Le jeu est gagné!");	// à afficher en grand sur le painter
					return true;								// il faut arrêter le jeu
				}
			}
			if(Case.verifCle(Hero.getAbscisse(),Hero.getOrdonnee())) {
				NombreCle+=1;
			}
		}
		System.out.println("Le temps est écoulé, partie perdue!");
		*/
		return false;
	}
	
}
