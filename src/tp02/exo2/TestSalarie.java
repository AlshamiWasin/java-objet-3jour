package tp02.exo2;

public class TestSalarie {

    public TestSalarie() {
// TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Individu am=new Individu("Aurélien","Martineau");
        Salarie ak=new Salarie("Alain","Kerlero",5000);
        System.out.println("Individu : "+am.toString());
        System.out.println("Salarie : "+ak.toString());
    }

}
