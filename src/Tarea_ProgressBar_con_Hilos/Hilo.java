package Tarea_ProgressBar_con_Hilos;
import javax.swing.JProgressBar;

public class Hilo implements Runnable {

	JProgressBar pbrBarra;
	public Hilo (JProgressBar barra)
	{ this.pbrBarra= barra;}
	
	public void run()
	{
		for(int i=1; i<=100;i++)
		{
			pbrBarra.setValue(i);
			System.out.println("LLenando barra");
			try {Thread.sleep(50);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("Completado");
	}
	
}
