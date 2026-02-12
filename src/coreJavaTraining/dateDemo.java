package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {
        // current date and time
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(d.toString());
        System.out.println (df.format(d));
        System.out.println(sd.format(d));

    }
}
