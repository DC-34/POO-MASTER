public class MainMouse {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse("Tiene mucho DPI");
        Mouse m3 = new Mouse(true, true);
        Mouse m4 = new Mouse("Tiene mucho DPI", true, true);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
