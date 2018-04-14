public class IntString {
    public static void main(String[] args) {
        String intString = "12";
        String doubleString = "12.023";

        int i = Integer.parseInt(intString);
        double d = Double.parseDouble(doubleString);

        System.out.println(i + d);
    }

}
