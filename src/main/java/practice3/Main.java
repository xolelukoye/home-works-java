package practice3;

public class Main {

    public static void main(String[] args) {

    Library library1 = new Library();

        System.out.println(library1.category);
        System.out.println(library1.year);
        System.out.println(library1.author);
//        вызвать private поле bookTitle нельзя напрямую, только через геттер/сеттер
//        System.out.println(library1.bookTitle);
        System.out.println(library1.getBookTitle());
        library1.setBookTitle("Shine");
        System.out.println(library1.getBookTitle());

        University student1 = new University(1, "Николай");
        University student2 = new University(2, "Пётр");
        University student3 = new University(3, "Ксения");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("ТУСУР");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings firstGame = new GameSettings("LOST", 3);
        GameSettings secondGame = new GameSettings("Super Game", 2);
        System.out.println(GameSettings.maxPlayers);
        GameSettings.setMaxPlayers(3);
        System.out.println(GameSettings.maxPlayers);
        secondGame.addPlayer();
        secondGame.addPlayer();
        secondGame.printGameStatus();

        Person firstHuman = new Person("Иван", "Иванов", "123-45-6789");
        Person secondHuman = new Person("Василий", "Петрович", "987-65-4321");
        firstHuman.printPersonInfo();
        secondHuman.printPersonInfo();
        firstHuman.setFirstName("Алексей");
        firstHuman.printPersonInfo();
        secondHuman.printPersonInfo();

    }

}
