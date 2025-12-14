package practice5.task8;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Экспонат был помещён в музей");
    }

    public void showExhibit() {
        System.out.println("Описание экспоната: " + this.exhibit.getDescribe());
    }

    public void preserve() {
        this.exhibit.preserve();
    }

}
