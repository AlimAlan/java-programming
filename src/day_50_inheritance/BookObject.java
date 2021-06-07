package day_50_inheritance;

import sun.util.calendar.CalendarUtils;

public class BookObject {
    public static void main(String[] args) {
        Book book=new Book();
        book.title="intro to java";
        book.author="Savitch";
        book.type="programming";
        book.price=85.0;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);
        System.out.println();
        AudioBook audioBook=new AudioBook();
        audioBook.author="Selenium cook Book";
        audioBook.length=3000;
        audioBook.narrator="Irina";
        audioBook.author="UnMesh";
        audioBook.price=11.2;
        audioBook.title="Selenium";
        audioBook.type="Automation";
        audioBook.listen();

        EBook eBook=new EBook();
        eBook.title="Java data structure";
        eBook.author="Savitch";
        eBook.type="programming";
        eBook.size=2;
        eBook.readBook();



    }
}
