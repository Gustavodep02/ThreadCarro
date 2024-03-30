package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCarro;

public class Main {

	public static void main(String[] args) {
		int sentido [] = {1,2,3,4};
	    int permissoes = 1 ;
	    Semaphore semaforo = new Semaphore(permissoes);
	    for (int i = 0; i < 4; i++) {
            Thread c  = new ThreadCarro(permissoes, sentido[i], semaforo);
            c.start();
        }
	}

}
