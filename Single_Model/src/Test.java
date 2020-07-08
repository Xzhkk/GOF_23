public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        Singleton_01 s3 = Singleton_01.getInstance();
        Singleton_01 s4 = Singleton_01.getInstance();

        Singleton_02 s5 = Singleton_02.getInstance();
        Singleton_02 s6 = Singleton_02.getInstance();
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5==s6);

    }
}
