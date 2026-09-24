import java.text.MessageFormat; import java.util.Scanner;
public class Lab3_Almadani { public static void main(String[] args) { Scanner in = new Scanner(System.in);
    System.out.print("Int: ");
    int a = in.nextInt();

    System.out.print("Double: ");
    double b = in.nextDouble();

    System.out.print("String: ");
    String c = in.next();

    System.out.print("Boolean: ");
    boolean d = in.nextBoolean();

    System.out.println("\n--- Out ---");

    System.out.printf("1) %d | %.2f | %s | %b%n", a, b, c, d);
    System.out.printf("2) Oct: %o, Hex: %x, Str limit: %.3s%n", a, a, c);
    System.out.printf("3) Width: %10d | %-12s | %B%n", a, c, d);
    System.out.printf("4) %+d | %e | %10.1f%n", a, b, b);

    System.out.println(MessageFormat.format("5) Str: {0}, Num: {1}, Dbl: {2}", c, a, b));
    System.out.println(MessageFormat.format("6) Currency: {0,number,currency} | Int: {1,number}", b, a));
    System.out.println(MessageFormat.format("7) Reverse order: {3}, {2}, {1}, {0}", c, a, b, d));

    String res8 = """
            8) Int: %05d
               Double: %.4f
               String: %s
            """.formatted(a, b, c);
    System.out.print(res8);

    String res9 = """
            9) [%-15s] -> 0x%X
            """.formatted(c, a);
    System.out.print(res9);

    String res10 = """
            10) Data: d=%d, f=%.1f, s='%s', b=%b
            """.formatted(a, b, c, d);
    System.out.print(res10);

    in.close();
}
}