public class StackTraceDemo {
    public static void foo() {
        try {
            int num1 = 5/0;
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
}