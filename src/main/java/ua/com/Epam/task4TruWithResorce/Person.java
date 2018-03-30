package ua.com.Epam.task4TruWithResorce;

public class Person implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close it!");
    }
}
