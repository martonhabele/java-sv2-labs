package debug;

public class Star {
    public static void main(String[] args) {
        Star star = new Star();

        int[] numberOfStars = {1, 3, 6, 8, 12};

        star.writeStars(numberOfStars);
    }


    public void writeStars(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
//            int prev = 0;
            int stars = numbers[i] - numbers[i - 1];
            printStars(stars);
//            prev = numbers[i];
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
}