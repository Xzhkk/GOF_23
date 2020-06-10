public abstract class CaffineBeverageWithHook {
    void prepareRecipe(){
        bilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract  void brew();
    abstract  void addCondiments();
    void bilWater(){
        System.out.println("讲水煮沸");
    }
    void pourInCup(){
        System.out.println("装进杯子");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
