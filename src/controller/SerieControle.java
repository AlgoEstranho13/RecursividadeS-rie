package controller;

public class SerieControle {

	public static double Serie(int N) {
		//Condição de parada-> Quando N é 1, pois a série começa com o valor 1/1 e o denominador aumenta a cada passo
		if (N<2)
		{
			return 1;
		}
		else 
		{
			//A função é chamada em uma soma com o valor de 1/N, que é subtraído a cada chamada
			double serie = 1/(double)N + Serie(N-1);
			return serie;
		}
	}
}
