public class UniversalGreeting {
    public static String greeting(String message) {
        switch (message) {
            case "EN":
                return "Hello, How are you?";
            case "FR":
                return "Bonjour comment allez-vous?";
            default:
                return "Hola, cómo estás?";
        }
    }

    public static void main(String[] args) {
        System.out.println(UniversalGreeting.greeting("ES"));
    }
}