import java.util.Scanner;


public class principale05_1 {

	public static void main(String[] args) {
		//initialisation de variables
				int nbreAnnee;
				double tauxInteret, capitalDepart, capitalFinal,gain;
				
				nbreAnnee =0;
				tauxInteret = 0.;capitalDepart =0.;capitalFinal =0.; gain =0.;
				
				
				Scanner clavier = new Scanner(System.in);
				
				System.out.print("quel est le montant de depart � placer ? (en �) ");
				capitalDepart = clavier.nextDouble();
				System.out.print("quel est le taux d'int�r�t du placement ? ");
				tauxInteret = clavier.nextDouble();
				System.out.print("Quel est le gain souhait� ? (en �) ");
				gain = clavier.nextDouble();// le gain doit �tre strictement positif.
				capitalFinal = capitalDepart;
				
				while(capitalFinal - capitalDepart < gain){
					nbreAnnee ++;
					capitalFinal = (1+ tauxInteret/100)*capitalFinal;
				}
				System.out.print("Le gain de");
				System.out.printf("%6.0f",gain); // formatoge du resultat avec 2 chiffres apr�s la virgule.
				System.out.print("sera atteint au bout de "+ nbreAnnee +" an(s).");
				clavier.close();

	}

}
