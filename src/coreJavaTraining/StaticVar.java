package coreJavaTraining;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StaticVar {

    String name; // Instant variable
    String address;
    static String city ="Bangalore";// Class variable
    static int i = 0;


    StaticVar(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }

    public void getAddress() {
        System.out.println(address+" "+city);
    }

    public void getCity() {
        System.out.println(city);
    }


    public static void main(String[] args) {

        StaticVar obj = new StaticVar("Dhanunjaya", "BTM");
        StaticVar obj1 = new StaticVar("Ram", "Jayanagar");
        StaticVar obj2 = new StaticVar("Ram", "Jayanagar");
        obj.getAddress();
        obj1.getAddress();

    }
}
