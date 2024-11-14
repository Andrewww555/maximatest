public class Author {
    private String firstName; // Имя автора
    private String lastName;  // Фамилия автора

    // Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Переопределение toString
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
