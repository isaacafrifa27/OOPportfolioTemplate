public class StudentGrades {
    public static void main(String[] args) {
        // Student data
        String[] names = {"Joe", "William", "Mary", "Isaac", "Afrifa"};
        int[] labPoints = {74, 72, 70, 85, 88};
        int[] bonusPoints = {5, 8, 12, 15, 12};

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int totalPoints = labPoints[i] + bonusPoints[i];
            System.out.println(name + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + totalPoints);
        }
    }
}
