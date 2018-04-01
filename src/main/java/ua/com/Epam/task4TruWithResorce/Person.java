package ua.com.Epam.task4TruWithResorce;

public class Person implements AutoCloseable{

    @Override
    public void close() throws Exception {
        int num = 5/0;
        System.out.println("close it!");
    }


}
