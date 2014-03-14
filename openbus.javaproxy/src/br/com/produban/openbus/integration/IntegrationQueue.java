package br.com.produban.openbus.integration;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class IntegrationQueue {

	private LinkedBlockingQueue<ByteBuffer> integrationQueue = new LinkedBlockingQueue<ByteBuffer>();
	private volatile static IntegrationQueue instance;

	private IntegrationQueue() {
	}

	public static IntegrationQueue getInstance() {
		if (instance == null) {
			synchronized (IntegrationQueue.class) {
				if (instance == null) {
					instance = new IntegrationQueue();
				}
			}
		}
		return instance;
	}

	public void insert(ByteBuffer byteBuffer) {
		try {
			if (byteBuffer != null)
				integrationQueue.put(byteBuffer);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public LinkedList<ByteBuffer> getAll() {
		LinkedList<ByteBuffer> linkedList = new LinkedList<ByteBuffer>();
		integrationQueue.drainTo(linkedList, 100);
		return linkedList;
	}
}
