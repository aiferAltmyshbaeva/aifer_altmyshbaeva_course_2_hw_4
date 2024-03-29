import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 5 names to fill in List A: ");
        List<String> listA = new ArrayList<>();
        populateListFromConsole(listA);
        System.out.println("List A: " + listA);

        System.out.println("Input 5 more names to fill in List B: ");
        List<String> listB = new ArrayList<>();
        populateListFromConsole(listB);
        System.out.println("List B: " + listB);

        Collections.reverse(listB);

        List<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }

        System.out.println("List C: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("List C: " + listC);

    }

    private static void populateListFromConsole(List<String> list) {
        for (int i = 0; i < 5; i++) {
            String str = SCANNER.next();
            list.add(str);
        }
    }
}