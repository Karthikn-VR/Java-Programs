import java.util.*;

public class SortBySecondDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        String[] strArr = str.split(" ");

        Arrays.sort(strArr, (String a, String b) -> {
            if (a.length() < 2 || b.length() < 2) return 0;
            return Character.compare(a.charAt(1), b.charAt(1));
        });

        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }
}
