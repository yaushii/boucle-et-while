import java.util.Scanner;


public class principal05 {

	public static void main(String[] args) {
		//initialisation de variables
		int nbreAnnee, i;
		double tauxInteret, capitalDepart, capitalFinal;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("quel est le montant de depart � placer ? (en �) ");
		capitalDepart = clavier.nextDouble();
		System.out.print("Combien d'ann�e va t'il �tre plac� ? ");
		nbreAnnee = clavier.nextInt();
		System.out.print("quel est le taux d'int�r�t du placement ? ");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalDepart;
		
		for(i =1; i <= nbreAnnee; i++){
			capitalFinal = (1 + tauxInteret/100)* capitalFinal;
		}
		System.out.print(" Les int�rets acquis au bout de "+ nbreAnnee + " an(s) sont de : ");
		System.out.printf("%6.2f", capitalFinal - capitalDepart); // formatoge du resultat avec 2 chiffres apr�s la virgule.
		System.out.print("�");
		clavier.close();
	}

}
