public class StringPlay {
    public static void main(String[] args) {
        String college = new String("Leeds Beckett University ");
        String town = "Anytown, Uk";

        int stringLength;
        String change1, change2, change3;
        stringLength = college.length();

        change1 = college.toUpperCase();
        change2 = change1.replace("e, s", "*");
        change3 = college.concat(town);
        System.out.println("The final string is " + change3);
    }
}