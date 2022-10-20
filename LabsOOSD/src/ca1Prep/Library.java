package ca1Prep;

public class Library {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int=0; i<3; i++) {
            System.out.println("Please enter the name for this book" + (i + 1));

            String name = in.nextLine();

            System.out.println("Please enter author for this book" + (i + 1));

            String author = in.nextLine();

            System.out.println("Please enter genre for this book" + (i + 1));

            String genre = in.nextLine();
        }
    }
}