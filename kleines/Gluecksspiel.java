
package kleines;
import java.util.Scanner;
import java.util.Random;
public final class Gluecksspiel {

	public static void main(String[] args) {
	
		Scanner untergrenze = new Scanner(System.in);
		Scanner obergrenze = new Scanner(System.in);
		
		int ug=0;
		int og=0;
		while(ug == 0) {
		try {
		System.out.println("Bitte geben Sie die Untergrenze für Ratebereich ein");
		ug = Integer.parseInt(untergrenze.nextLine());
		if(ug<=0) {
		System.out.println("Geben Sie eine Natürliche Zahl über 0 ein");
		ug=0;
		
		}
		else {
			while(og==0) {
			try {
			System.out.println("Bitte geben Sie die Obergrenze für Ratebereich ein");
			og = Integer.parseInt(obergrenze.nextLine());
			if(og<=0) {
				System.out.println("Geben Sie eine Natürliche Zahl über 0 ein");
				og=0;
			} else { 
				if(og<ug) {
				System.out.println("Geben Sie eine Obergrenze ein die über der Untergrenze ist");
				og=0;
				}
			}
			
		}catch(NumberFormatException e) {
			System.out.println("Ungültige Eingabe2");	
		}
		
			}
		}}
	
		catch(NumberFormatException e)
		{
		System.out.println("Ungültige Eingabe1");	
		}
		}
System.out.println("Die Untergrenze liegt nun bei "+ug);
System.out.println("Die Obergrenze liegt nun bei "+og);
System.out.println("");




Random rand = new Random();
int zufallszahl = ug + rand.nextInt(og - ug +1);
	System.out.println("Zahl"+zufallszahl);
	Scanner eingabe = new Scanner(System.in);
	int rate=0;
	double counter = 0;
	double maxcounter = (og-ug)*0.2;
	maxcounter = Math.ceil(maxcounter);
	double i=maxcounter;
	System.out.println("Sie haben maximal " +maxcounter+ "Versuche");
	while(rate==0) {
		try {
		System.out.println("Bitte geben Sie Zahl ein die Sie Raten");
		rate = Integer.parseInt(eingabe.nextLine());
		if(rate<=0) {
			System.out.println("Geben Sie eine Natürliche Zahl über 0 ein");
			rate=0;
		} else if(rate<ug) { 
			
			System.out.println("Die geratene Zahl liegt unter der Untergrenze  "+ug);
			rate=0;}
			
			else if(rate>og) {
			System.out.println("Die geratene Zahl liegt über der Obergrganze  "+og);
			rate=0;
			}
			else {
				
			if(rate<zufallszahl) {
			
			counter++;
			i--;
			
			
			if(i!=0) {
				System.out.println("Die geratene Zahl ist unter der Zufallszahl");
				System.out.println("Verbleibende Versuche  "+i);
				rate=0;
			} else {
				System.out.println("Sie haben verloren");
				System.out.println("Die Zufallszahl war " +zufallszahl);
				rate=1;
			}
			
			} else if(rate>zufallszahl) {
				
				counter++;
				i--;
				
				if(i!=0) {
					System.out.println("Die geratene Zahl ist über der Zufallszahl");
					System.out.println("Verbleibende Versuche  "+i);
					rate=0;
				} else {
					System.out.println("Sie haben verloren");
					System.out.println("Die Zufallszahl war " +zufallszahl);
					rate=1;
				}
			} else if (rate == zufallszahl){
			 counter++;
			 System.out.println("Richtig geraten");
			 System.out.println("Sie haben " +counter+" Versuche gebraucht");
			
			}
			}
		
		
	}catch(NumberFormatException e) {
		System.out.println("Ungültige Eingabe2");	
	}}
	
		

}}
