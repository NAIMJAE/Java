package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 날짜 : 2024/01/17
 * 이름 : 박임재
 * 내용 : Java Socket 프로그래밍 실습
 */
public class SocketServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 50001));
			
			System.out.println("연결 대기...");
			Socket socket = serverSocket.accept();
			
			System.out.println("연결 수립...");
			
			// 데이터 수신 (client -> server) 
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
	
			// 데이터 송신 (Server -> Client)
			OutputStream os = socket.getOutputStream();
			String msg = "ByeBye Server!";
			System.out.println("데이터 송신 완료...");
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			socket.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("서버 종료...");
	}
}
