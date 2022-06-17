package cours_17_06_2022.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class TestCollection {

    public static void main(String[] args) {

        Collection<Test> macol = new TreeSet<>();


        /*Collection<Integer> macol = new ArrayList<>();*/

        macol.add(new Test(1));
        macol.add(new Test(10));
        macol.add(new Test(4));
        macol.add(new Test(6));
        macol.add(new Test(7));
        macol.add(new Test(3));
        macol.add(new Test(2));

        for (Test test : macol) {
            System.out.println(test.getNumberTest());
        }


    }

}
