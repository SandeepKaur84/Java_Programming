package Day2;

public class ConditionalSt {
    public static void main(String[] args) {
        // int a = 10;
        // if(a >= 5) {
        // System.out.println("Win");
        // }else {
        // System.out.println("Lost");
        // }

        // String res = ((a>=5) ? "Win" : "Loss");
        // System.out.println(res);

        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Color doest match");
                break;
        }
    }
}
