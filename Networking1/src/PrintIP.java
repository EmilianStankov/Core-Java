import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

public class PrintIP {
    static void displayInterfaceInformation(NetworkInterface netint) throws IOException {
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            if (netint.getName().equals("wlan0") && !inetAddress.isLoopbackAddress()) {
                System.out.printf("Display name: %s\n", netint.getDisplayName());
                System.out.printf("Name: %s\n", netint.getName());
                System.out.printf("InetAddress: %s\n", inetAddress);
            }
        }
        System.out.printf("\n");
    }

    public static void main(String args[]) throws IOException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            displayInterfaceInformation(netint);
        }
    }
}
