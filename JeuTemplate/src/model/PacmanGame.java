package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import engine.Cmd;
import engine.Game;

import java.time.Instant;
/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 *         Version avec personnage qui peut se deplacer. A completer dans les
 *         versions suivantes.
 * 
 */
public class PacmanGame implements Game {

	/**
	 * constructeur avec fichier source pour le help
	 * 
	 */
	private int NombreCle=0;
	private static Instant TempsDepart=Instant.now();
	private static long TempsMax=2000; //C'est en nano secondes
	
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

	/**
	 * faire evoluer le jeu suite a une commande
	 * 
	 * @param commande
	 */
	@Override
	public void evolve(Cmd commande) {
		System.out.println("Execute "+commande);
	}

	/**
	 * verifier si le jeu est fini
	 */
	@Override
	public boolean isFinished() {
		// le jeu n'est jamais fini
		return false;
	}

	@Override
	public void check(int abscisse, int ordonnee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void possedeCle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajoutCle() {
		// TODO Auto-generated method stub
		if (Case.VerifCle==True) {
			NombreCle+=1;
		}
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
	
}
