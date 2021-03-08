package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ирина");
        User user2 = new User("Марина");
        User user3 = new User("Карина");

        user1.sendMessage(user2, "Привет! Меня зовут Ирина :-)");
        user1.sendMessage(user2, "Как у тебя дела?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "А я Марина :-)");
        user2.sendMessage(user1, "Все ок, спасибо :)");

        user3.sendMessage(user1, "Здравствуй!");
        user3.sendMessage(user1, "Карина");
        user3.sendMessage(user1, "Как у тебя дела?");

        user1.sendMessage(user3, "Приятно познакомиться!");
        user1.sendMessage(user3, "Мне тоже!");
        user1.sendMessage(user3, "Пройдем пообщаемся?");

        user3.sendMessage(user1, "Конечно!");

        MessageDatabase.showDialog(user1,user3);
        MessageDatabase.showDialog(user1, user2);
    }
}