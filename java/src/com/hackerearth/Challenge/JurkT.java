import java.util.*;
import java.lang.*;


class JurkyThread extends Thread{
	private int data = 0;
	private boolean done = false;

	public synchronized int getData(){
		return this.data;
	}

	public synchronized boolean isDone(){
		return this.done;
	}

	//public synchronized JurkyThread(int data){ // Checked Exception: synchronized not allowed here
	public JurkyThread(int data){

		this.data = data; 
	}

	public synchronized void run(){
		data += data;
		done = true;
	}
}

class JurkT{
	public static void main(String args[]){
		JurkyThread[] jt = new JurkyThread[3];
		for(int i=0;i<3;i++){
			jt[i] = new JurkyThread(i);
			jt[i].start();
		}
		for(int i=0;i<3;i++){
			if(jt[i].isDone()){
				System.out.println(jt[i].getData());
			}
		}
	}
}

