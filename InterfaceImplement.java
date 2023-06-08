public class InterfaceImplement implements MyFirstInterface {
    @Override
    public void display() {
        System.out.println(x);

    }

    @Override
    public void display1() {
        System.out.println(y);

        // can't to change the variable value, because these variables are final variables.
    }
}
