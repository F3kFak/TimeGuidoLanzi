public class App {
    public static void main(String[] args) throws Exception {
        Time t = new Time(1, 40, 20);
        System.out.println(t.convertiSecondi());
        t.addSecondi(10);
        System.out.println(t.convertiSecondi());
        System.out.println(t.convertiOre(3670));
    }
}
