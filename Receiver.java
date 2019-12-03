import java.net.*;
import java.io.*;
import java.util.*;

public class Receiver {

public static void main(String[] args) throws Exception{

DatagramSocket ss=new DatagramSocket(1234);


System.out.println("Server is up....");

byte[] rd=new byte[100];
byte[] sd=new byte[100];

DatagramPacketrp=new DatagramPacket(rd,rd.length);

ss.receive(rp);

InetAddressip= rp.getAddress();

int port=rp.getPort();

Date d=new Date();   // getting system time

String time= d + "";  // converting it to String

sd=time.getBytes();   // converting that String to byte

DatagramPacketsp=new DatagramPacket(sd,sd.length,ip,port);

ss.send(sp);

rp=null;

System.out.println("Done !! ");
}

}

