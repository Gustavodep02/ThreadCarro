package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread{
	int permissoes;
	int sentido;
	Semaphore semaforo = new Semaphore(permissoes);
	public ThreadCarro(int permissoes,int sentido, Semaphore semaforo) {
		this.permissoes = permissoes;
		this.semaforo = semaforo;
		this.sentido = sentido;
	}
	@Override
	public void run() {
		try {
			semaforo.acquire();
			andar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}
	public void andar() {
		switch (sentido) {
		case 1:
			System.out.println("Carro indo para o norte");
            break;
		case 2:
			System.out.println("Carro indo para o sul");
            break;
		case 3:
			System.out.println("Carro indo para o leste");
            break;
		case 4:
            System.out.println("Carro indo para o oeste");
            break;
        default:
            break;
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}}
