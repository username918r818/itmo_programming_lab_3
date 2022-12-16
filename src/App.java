import Z.utils.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listik = new List<Integer>();
        listik.add(1);
        listik.add(7);
        listik.add(1);
        listik.add(2);
        listik.add(1);
        listik.add(3);
        listik.add(1);
        listik.remove(5);
        listik.remove(1);
        System.out.println(listik.find(1)); // salse
        System.out.println(listik.find(5)); // false
        System.out.println(listik.find(3)); // true
    }
}
