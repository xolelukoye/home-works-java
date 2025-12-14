package practice5.task8;

//8. Музей
//Условие:
//В музее выставлен экспонат.
//У каждого экспоната своя история и условия хранения.
//Примеры:
//Манускрипт — требует контролируемой влажности
//Скульптура — нуждается в реставрации
//Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.

public class Main {

    public static void main(String[] args) {

        Museum sculptureMuseum = new Museum();
        Sculpture david = new Sculpture();

        Museum manuscriptMuseum = new Museum();
        Manuscript manuscript = new Manuscript();

        sculptureMuseum.addExhibit(david);
        sculptureMuseum.showExhibit();
        sculptureMuseum.preserve();

        manuscriptMuseum.addExhibit(manuscript);
        manuscriptMuseum.showExhibit();
        manuscriptMuseum.preserve();

    }

}
