package es.studium.Poker;

import java.util.Random;

public class Modelo
{
	Random rnd = new Random();
	public void barajarCentro(int uno[], int dos[],int tres[], int cuatro[],int cinco[])
	{		
		int jugador = 0;
		
		/* 
		 * 
		 * c1=0, c2=0
		 * while (c1 == c2 && c1 == c3 && c1 = c4){
		 * c1 = new randomm
		 * c2 = new random
		 * 
		 * */
		int iUno=0, iDos=0, iTres=0, iCuatro=0, iCinco=0;
		
		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			
			if((jugador==0)&&(iUno<26)) // Carta Centro 1
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Carta Centro 2
			{
				dos[iDos] = i;
				iDos++;
			}
			else if(iTres<26) // Carta Centro 3
			{
				tres[iTres] = i;
				iTres++;
			}
			else if(iCuatro<26) // Carta Centro 4
			{
				cuatro[iCuatro] = i;
				iCuatro++;
			}
			else if(iCinco<26) // Carta Centro 5
			{
				cinco[iCinco] = i;
				iCinco++;
			}
			
		}
		rebarajar(uno);
		rebarajar(dos);
		rebarajar(tres);
		rebarajar(cuatro);
		rebarajar(cinco);
	}
	public void barajar(int uno[], int dos[])
	{		
		int jugador = 0;
		int iUno=0, iDos=0;
		
		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			if((jugador==0)&&(iUno<26)) // Jugador 1
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Jugador 2
			{
				dos[iDos] = i;
				iDos++;
			}
		}
		rebarajar(uno);
		rebarajar(dos);
	}
	
	public void rebarajar(int t[])
	{
		int aleatorio, auxiliar;
		for(int i=0; i<26; i++)
		{
			aleatorio = rnd.nextInt(25)+1;
			auxiliar = t[i];
			t[i] = t[aleatorio];
			t[aleatorio] = auxiliar;
		}
	}
}