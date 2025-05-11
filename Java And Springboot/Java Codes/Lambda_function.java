interface A {
    void display(int i);
}

public class Lambda_function {
    public static void main(String[] args) {
        A obj;
        obj = (i) -> System.out.println("Hello TCSers! " + i);
        obj.display(10);
    }
}