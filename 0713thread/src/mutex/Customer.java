package mutex;

import java.util.ArrayList;

//List에서 데이터를 26번 꺼내서 출력하는 스레드
public class Customer extends Thread {
	private ShareData shareData;
	
	public Customer(ShareData shareData) {
		this.shareData = shareData;
	}
	
	//스레드로 수행할 내용을 가지는 메소드
	public void run() {
		for(int i=0; i<26; i=i+1) {
			shareData.get();
		}
	}
}








