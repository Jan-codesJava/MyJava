package Methods;

import com.sun.deploy.panel.NetworkSettingsDialog;
import sun.nio.ch.Net;

public class Netflix {

    //create a instance fields: accountName, userName, monthlyUsage
    //- create a method that will update usage of the data for each user
    // that uses
    // - this method will take a parameter for amount of data usage

    // - test your code

    String accountName = "JANA";
    String userName;
    static double monthlyData = 200;

    public void usage(double data){

    monthlyData = monthlyData - data;

    }

    public static void main(String[] args) {
        Netflix flix = new Netflix();


        flix.usage(12);
        System.out.println(flix.monthlyData);
        System.out.println(flix.accountName);
        flix.usage(10);
        System.out.println(flix.monthlyData);

        Netflix net = new Netflix();
        net.usage(2);
        System.out.println(net.monthlyData);
    }

}
