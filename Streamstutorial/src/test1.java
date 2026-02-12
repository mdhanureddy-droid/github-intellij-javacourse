import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    //Count the number of names starting with alphabet A in list
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        int count = 0;

        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if (actual.startsWith("A")) {
                count++;
            }
        }

        System.out.println(count);
    }


@Test
 public void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        //print all the names which length is greater than 4
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

        //print 3 names having length >4
        names.stream().filter(s -> s.length() > 4).limit(3).forEach(s -> System.out.println(s));

    }


@Test
public void streamMap()
{
    ArrayList<String> names = new ArrayList<String>();
    names.add("man");
    names.add("Don");
    names.add("women");

    // print names which have last letter as "a" with Uppercase
    Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
// print names which have first letter as a with uppercase and sort
    List<String> names1 = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");
    names1.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
// merging 2 different lists
    Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
    //newStream.sorted().forEach(s-> System.out.println(s));
    boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
    System.out.println(flag);
    Assert.assertTrue(flag);

}
@Test
    public void streamCollect()
    {
    ArrayList<String> names = new ArrayList<String>();
    names.add("man");
    names.add("mohan");
    names.add("Don");
    names.add("women");
    List<String> ls=names.stream().filter(s->s.startsWith("m")).map(s->s.toUpperCase()).collect(java.util.stream.Collectors.toList());
    System.out.println(ls.get(0));

    List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
   // PRINT UNIQUE NUMBER FROM THIS ARRAY
        // SORT THE ARRAY

      //  values.stream().distinct().forEach(s->System.out.println(s));
       List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li);
    }

}


