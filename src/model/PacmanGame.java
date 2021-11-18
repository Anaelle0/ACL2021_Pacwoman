package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import engine.Cmd;
import engine.Game;
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
	}
	
	public void check(int abscisse,int ordonnee) {	// checker si la case n'est pas occup�e par un mur
		
	}
	
	public void possedeCle() {
		
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
	public void AjoutCle() {
		if (Case.VerifCle==True) {
			NombreCle+=1;
		}
	}
	*/


	//verifier si le jeu est fini
	@Override
	public boolean finJeu() {
		// le jeu n'est jamais fini
		return false;
	}

}
