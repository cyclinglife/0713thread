package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		//�տ��� ���� Ŭ������ �ν��Ͻ��� ����� run �޼ҵ带 ȣ��
		/*
		ThreadEx1 th1 = new ThreadEx1();
		th1.run();
		ThreadEx1 th2 = new ThreadEx1();
		th2.run();
		*/
		
		
		//������� ����
		ThreadEx1 th1 = new ThreadEx1();
		th1.setDaemon(true);
		th1.start();
		ThreadEx1 th2 = new ThreadEx1();
		th2.setDaemon(true);
		th2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� ����");
		
	}

}



