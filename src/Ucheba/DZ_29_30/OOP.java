package Ucheba.DZ_29_30;

public class OOP {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");

        Author author2 = new Author("Тоору", "Фудзисава");

        Book book1 = new Book("Крещение огнём", author1, 1996);

        Book book2 = new Book("Great Teacher Onizuka", author2, 1997);

        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1);
        System.out.println(book2);

        book1.setTitle("One Piece");
        book1.setYear(1997);
        book1.setAuthor(new Author("Эйитиро", "Ода"));
        System.out.println(book1);

    }
}
