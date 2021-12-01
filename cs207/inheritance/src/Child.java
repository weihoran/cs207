public class Child extends Parent {
    private char a;

    public Child() {
        super();
        this.a = ((Parent) this).a;
    }
}