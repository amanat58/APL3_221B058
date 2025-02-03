class RubberDuck extends Duck implements SqueakBehavior, MuteBehavior {
    @Override
    public void squeak() {
        System.out.println("The rubber duck squeaks!");
    }

    @Override
    public void mute() {
        System.out.println("The rubber duck is mute.");
    }
}
