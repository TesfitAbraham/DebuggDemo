public class Main {
    public static void main(String[] args) {
        int area;

        StackTraceDemo.foo();

        RectangelArea rectangelArea = new RectangelArea();
        rectangelArea.setLength(4);

        rectangelArea.setWidth(5);
        area = rectangelArea.getLength() * rectangelArea.getWidth();
        System.out.println("Area of rectangle " + area);


    }
}