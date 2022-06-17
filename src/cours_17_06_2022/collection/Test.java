package cours_17_06_2022.collection;

import java.util.Comparator;

public class Test implements Comparator<Test>{

    private int numberTest;

    public Test(int numberTest) {
        this.setNumberTest(numberTest);
    }

    public int getNumberTest() {
        return numberTest;
    }

    public void setNumberTest(int numberTest) {
        this.numberTest = numberTest;
    }


    @Override
    public int compare(Test o1, Test o2) {
        if (o1.getNumberTest() > o2.getNumberTest()){
            return 1;
        }else if (o1.getNumberTest() < o2.getNumberTest()){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }

}
