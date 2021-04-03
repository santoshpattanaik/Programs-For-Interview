package hackerrank;

public class LocalChemicalName {
    public static void main(String[] args) {
        String input = "Santosh Monalisa Somu##liquid";
        String output = playWithString(input);
        System.out.println(output);
    }

    private static String playWithString(String input_information) {
        String finalOutput ="";

        String[] splitInputString = input_information.split("##");
        String property = splitInputString[1];
        int propertyLen = property.length();
        String chemical = splitInputString[0];
        System.out.println(chemical);

        String[] splitChemical = chemical.split(" ");
        System.out.println(splitChemical[0]);

        for (String str:splitChemical) {
            int strLen = str.length();
            if (propertyLen > strLen )
                finalOutput = finalOutput.concat("plus"+(propertyLen-strLen)+" ");
            else
                finalOutput = finalOutput.concat("minus"+(strLen-propertyLen)+" ");
        }

        return finalOutput;
    }
}
