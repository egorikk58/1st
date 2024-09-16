/**
 * Главный класс программы, содержащий точку входа в виде метода {@code main}.
 */
public class Main {
    /**
     * Точка входа в программу.
     * Создает экземпляр класса {@code UserInterface} и запускает метод {@code Run()},
     * который инициирует выполнение программы.
     *
     * @param args - аргументы командной строки (не используются в данном методе).
     */
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        UI.Run();
    }
}