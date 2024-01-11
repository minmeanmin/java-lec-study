package ex17;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class host2ip
{
    public static void main ( String[] args ) throws IOException   {
        String hostname = "www.naver.com";

        try     {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP 주소 : " + address.getHostAddress());
        }
        catch ( UnknownHostException e )  {
            System.out.println(hostname + "�� IP �ּҸ� ã�� �� �����ϴ�. " );
        }
    }
}