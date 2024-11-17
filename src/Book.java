public class Book {
        private String title;      // Название книги
        private Author author;     // Автор книги
        private int publicationYear; // Год публикации

        // Конструктор
        public Book(String title, Author author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        // Геттеры
        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        // Сеттер для года публикации
        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        // Переопределение toString
        @Override
        public String toString() {
            return "Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear;
        }
    }

class main {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Лев", "Толстой");

        // Создаем книги
        Book book1 = new Book("Преступление и наказание", author1, 1866);
        Book book2 = new Book("Война и мир", author2, 1869);

        // Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Изменяем год публикации для одной из книг
        book1.setPublicationYear(1886);
        System.out.println("После изменения года публикации:");
        System.out.println(book1);
    }
}