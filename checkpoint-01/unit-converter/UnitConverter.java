public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length != 3)
            return "Error";
        String first = args[0];
        String second = args[1];
        int nb;
        try {
            nb = Integer.parseInt(args[2]);

        } catch (NumberFormatException e) {
            return "Error";
        }
        if (first.equals("celsius") && second.equals("fahrenheit")) {
            return String.format("%.2f", (double) (nb * 9 / 5 + 32));
        }
        if (first.equals("fahrenheit") && second.equals("celsius")) {
            return String.format("%.2f", (double) (nb - 32 * 9 / 5));
        }
        if (first.equals("kilometers") && second.equals("miles")) {
            return String.format("%.2f", (nb * 0.621371));
        }
        if (first.equals("miles") && second.equals("kilometers")) {
            return String.format("%.2f", (nb * 1.60934));
        }
        if (first.equals("pounds") && second.equals("kilograms")) {
            return String.format("%.2f", (nb * 0.45359237));
        }
        return "Error";
    }

    public static void main(String[] args) {
        System.out.println(UnitConverter.convert(new String[] { "celsius", "fahrenheit", "100" }));
        System.out.println(UnitConverter.convert(new String[] { "fahrenheit", "celsius", "212" }));
        System.out.println(UnitConverter.convert(new String[] { "kilometers", "miles", "5" }));
        System.out.println(UnitConverter.convert(new String[] { "pounds", "kilograms" , "33"}));
    }
}