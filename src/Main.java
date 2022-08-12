public class Main {
    public static void main(String[] args) {

        // Задание 1
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.print("\n");
        int f = 10;
        for (; f > 0; f = f - 1) {
            System.out.print(f + " ");
        }
        System.out.print("\n");


        // Задание 2
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.print("Сегодня пятница, " + friday + " -е число" + "\n");
        }

        // Задание 3
        int startYear = 1822;
        int endYear = 2122;
        for (int currentYear = 0; currentYear <= endYear; currentYear = currentYear + 79){
            if (currentYear < endYear && currentYear > startYear){
                System.out.print(currentYear + "\n");
            }
        }



    }

}