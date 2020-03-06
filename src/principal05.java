import java.util.Scanner;


public class principal05 {

	public static void main(String[] args) {
		//initialisation de variables
		int nbreAnnee, i;
		double tauxInteret, capitalDepart, capitalFinal;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("quel est le montant de depart à placer ? (en €) ");
		capitalDepart = clavier.nextDouble();
		System.out.print("Combien d'année va t'il être placé ? ");
		nbreAnnee = clavier.nextInt();
		System.out.print("quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalDepart;
		
		for(i =1; i <= nbreAnnee; i++){
			capitalFinal = (1 + tauxInteret/100)* capitalFinal;
		}
		System.out.print(" Les intérets acquis au bout de "+ nbreAnnee + " an(s) sont de : ");
		System.out.printf("%6.2f", capitalFinal - capitalDepart); // formatoge du resultat avec 2 chiffres après la virgule.
		System.out.print("€");
		clavier.close();
	}

}
