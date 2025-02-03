class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("The lake duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("The lake duck is quacking.");
    }
}
