package br.com.produban.openbus.integration;

public class IntegrationListener implements Runnable {

	@Override
	public void run() {
		ListenerProcessor listenerProcessor = new ListenerProcessor();
		
		while (!Thread.interrupted()) {
			listenerProcessor.compute();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
