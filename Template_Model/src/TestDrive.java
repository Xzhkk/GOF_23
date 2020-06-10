public class TestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook=new TeaWithHook();
        CoffWithHook coffHook=new CoffWithHook();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaing coffee");
        coffHook.prepareRecipe();
    }
}
