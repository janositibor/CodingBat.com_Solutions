package Session07_String2.p03_CatDog;

public class Main {
    public static void main(String[] args) {
        CatDog catDog=new CatDog();

        System.out.println(catDog.catDog("catdog"));
        System.out.println(catDog.catDog("cat"));
        System.out.println(catDog.catDog("catcatcat"));
        System.out.println(catDog.catDog("1cat1cadodog"));
    }
}
