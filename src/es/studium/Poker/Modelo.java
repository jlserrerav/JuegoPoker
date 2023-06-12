package es.studium.Poker;

import java.util.Random;

public class Modelo
{
	Random rnd = new Random();
	public void barajarCentro1(int uno[], int dos[])
	{
		int baraja = 0;

		int iUno=0, iDos=0;

		for(int i = 1; i <= 52; i++)
		{
			baraja = rnd.nextInt(2);

			if((baraja==0)&&(iUno<26)) // Carta Centro 1
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Carta Centro 2
			{
				dos[iDos] = i;
				iDos++;
			}
		}
		rebarajar(uno);
		rebarajar(dos);

	}
	public void barajarCentro2(int tres[], int cuatro[], int cinco[])
	{
		int baraja = 0;

		int iTres=0, iCuatro=0, iCinco=0;

		for(int i = 1; i <= 52; i++)
		{


			if((baraja==0)&&(iTres<16)) // Carta Centro 3
			{
				tres[iTres] = i;
				iTres++;
			}
			else if(iCuatro<16) // Carta Centro 4
			{
				cuatro[iCuatro] = i;
				iCuatro++;
			}
			else if(iCinco<16) // Carta Centro 5
			{
				cinco[iCinco] = i;
				iCinco++;
			}
		}
		rebarajar(tres);
		rebarajar(cuatro);
		rebarajar(cinco);


	}
	public void barajarJugador1(int uno[], int dos[])
	{
		int jugador = 0;
		int iUno=0, iDos=0;

		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			if((jugador==0)&&(iUno<26)) // Jugador 1 1ºCarta
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Jugador 1 2ºCarta
			{
				dos[iDos] = i;
				iDos++;
			}
		}
		rebarajar(uno);
		rebarajar(dos);
	}
	public void barajarJugador2(int uno[], int dos[])
	{
		int jugador = 0;
		int iUno=0, iDos=0;

		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			if((jugador==0)&&(iUno<26)) // Jugador 1 1ºCarta
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Jugador 1 2ºCarta
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
		for(int i=0; i<16; i++)
		{
			aleatorio = rnd.nextInt(15)+1;
			auxiliar = t[i];
			t[i] = t[aleatorio];
			t[aleatorio] = auxiliar;
		}
	}
}
