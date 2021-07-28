


public class Generic {

    public static void main(String[] args) {

        Box<String> boxing = Util.<String>boxing("100");

        System.out.println("boxing = " + boxing.getT());
    }
}



