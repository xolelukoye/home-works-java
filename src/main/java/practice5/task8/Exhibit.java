package practice5.task8;

public abstract class Exhibit {
    private String describe;

    public Exhibit(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    abstract void preserve();
}
