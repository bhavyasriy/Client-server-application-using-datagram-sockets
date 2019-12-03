import java.net.*;
import java.io.*;

public class Sender {

public static void main(String[] args) throws Exception{

	System.out.println("Server Time >>>>");

	DatagramSocket cs=new DatagramSocket();

	InetAddressip=InetAddress.getByName("localhost");

	byte[] rd=new byte[100];
	byte[] sd=new byte[100];

	DatagramPacketsp=new DatagramPacket(sd,sd.length,ip,1234);

	DatagramPacketrp=new DatagramPacket(rd,rd.length);

	cs.send(sp);

	cs.receive(rp);

	String time=new String(rp.getData());

	System.out.println(time);

	cs.close();

}

}
