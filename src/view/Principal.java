package view;
import controller.SerieControle;

public class Principal {

	public static void main(String arqs[]) {
		SerieControle SC = new SerieControle();
		int N = 3;
		
		System.out.println("A soma da s�rie �: "+SC.Serie(N));
	}
}
