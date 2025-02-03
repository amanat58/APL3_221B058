class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("The redhead duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("The redhead duck is quacking.");
    }
}
