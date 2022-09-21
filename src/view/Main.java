package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.SemaphoreController;

public class Main {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);
		
		SemaphoreController[] carros = new SemaphoreController[4];
		String[] sentidos = {"cima", "baixo","esquerda","direita"};
		
//		System.out.println(sentidos.length);
		
		for(int i = 0; i < carros.length; i++) {
			Random random = new Random();
			int sentido = random.nextInt(4);
			
			carros[i] = new SemaphoreController(sentidos[sentido], semaforo);
			carros[i].start();
		}
	}

}
