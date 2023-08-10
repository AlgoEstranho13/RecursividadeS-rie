package controller;

public class SerieControle {

	public static double Serie(int N) {
		//Condi��o de parada-> Quando N � 1, pois a s�rie come�a com o valor 1/1 e o denominador aumenta a cada passo
		if (N<2)
		{
			return 1;
		}
		else 
		{
			//A fun��o � chamada em uma soma com o valor de 1/N, que � subtra�do a cada chamada
			double serie = 1/(double)N + Serie(N-1);
			return serie;
		}
	}
}
