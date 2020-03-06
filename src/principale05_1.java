import java.util.Scanner;


public class principale05_1 {

	public static void main(String[] args) {
		//initialisation de variables
				int nbreAnnee;
				double tauxInteret, capitalDepart, capitalFinal,gain;
				
				nbreAnnee =0;
				tauxInteret = 0.;capitalDepart =0.;capitalFinal =0.; gain =0.;
				
				
				Scanner clavier = new Scanner(System.in);
				
				System.out.print("quel est le montant de depart à placer ? (en €) ");
				capitalDepart = clavier.nextDouble();
				System.out.print("quel est le taux d'intérêt du placement ? ");
				tauxInteret = clavier.nextDouble();
				System.out.print("Quel est le gain souhaité ? (en €) ");
				gain = clavier.nextDouble();// le gain doit être strictement positif.
				capitalFinal = capitalDepart;
				
				while(capitalFinal - capitalDepart < gain){
					nbreAnnee ++;
					capitalFinal = (1+ tauxInteret/100)*capitalFinal;
				}
				System.out.print("Le gain de");
				System.out.printf("%6.0f",gain); // formatoge du resultat avec 2 chiffres après la virgule.
				System.out.print("sera atteint au bout de "+ nbreAnnee +" an(s).");
				clavier.close();

	}

}
