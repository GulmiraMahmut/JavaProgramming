package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "Safari";

        switch(browser){
            case "chrome":
            case"Chrome":
            case"CHROME":
            System.out.println("Opening google in chrome");
            break;

            case "firefox":
                System.out.println("Opening google in fire fox");
                break;
            case "Safari":
            case "safari":
                System.out.println("Special set up or Apple computers");
                System.out.println("Opening in safari");
                break;

            default:
                System.out.println("Opening in chrome by default");
        }




    }
}
