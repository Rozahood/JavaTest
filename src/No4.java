import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Mississippi: ");

        String s = myScanner.nextLine();
        int i = 0;
        int j = 0;
        int cnt = 0;
        int length = s.length();
        char ch;
        for (i = 0; i < length; i++) {
            ch = s.charAt(i);
            if (s.indexOf(ch) < i)
                continue;
            for (j = (i + 1); j < length; j++) {
                if (s.charAt(j) == ch)
                    cnt++;
            }
            System.out.println(ch + ": " + cnt);
            cnt = 0;
        }
    }
}
