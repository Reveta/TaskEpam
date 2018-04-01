package ua.com.Epam.task4TruWithResorce;

public class Main {
    public static void main(String[] args) {
        closeAll();
    }

    private static void closeAll() {


        try (Person person = new Person()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
