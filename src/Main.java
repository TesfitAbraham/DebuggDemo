public class Main {
    public static void main(String[] args) {
        int area;
        System.out.println("Hello world!");

        StackTraceDemo.foo();

        RectangelArea rectangelArea = new RectangelArea();
        rectangelArea.setLength(4);

        rectangelArea.setWidth(5);
        area = rectangelArea.getLength() * rectangelArea.getWidth();
        System.out.println("Area of rectangle " + area);


    }
}