package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo {
    public static void main(String[] args) {

        Calendar cl = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println(df.format(cl.getTime()));
        System.out.println(cl.get(Calendar.DAY_OF_MONTH));
    }
}