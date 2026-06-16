package Day5;

public class Stringss {
    public static void main(String[] args) {
        String name = "abc";
        System.out.println(name);
        String name2 = name.concat("xyz");
        System.out.println(name2);

        String a = "Helloo ";
        String b = "Java";
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.replace("l", "u"));
        System.out.println(a.substring(1,4));
        System.out.println(a.equals("Helloo "));
        System.out.println(a.equalsIgnoreCase("helLoo "));
        System.out.println(a.charAt(4));
    }
}


