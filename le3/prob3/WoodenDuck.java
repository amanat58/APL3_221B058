class WoodenDuck extends Duck implements MuteBehavior {
    @Override
    public void mute() {
        System.out.println("The wooden duck is mute.");
    }
}
