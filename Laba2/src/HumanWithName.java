public class HumanWithName {
    private Name name;
    private int height;

    public HumanWithName(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name.toString() + " Рост: " + height;
    }
}
