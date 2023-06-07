package es.studium.Poker;

import java.awt.Frame;
import java.io.IOException;
public class Ayuda  extends Frame {

		public Ayuda()

		{

		}

		public void AyudaPoker()

		{

			try

			{

				Runtime.getRuntime().exec("hh.exe AyudaPoker.chm");

			}

			catch (IOException e)

			{

				e.printStackTrace();

			}

		}

	
}
