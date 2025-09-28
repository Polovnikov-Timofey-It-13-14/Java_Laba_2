public class Human {
    private String name;
    private int height;

    //Конструктор с параметрами
    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Human(Human human) {
        this.name = human.name;
        this.height = human.height;
    }

    //Геттеры
    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + ", Рост: " + getHeight();
    }
}

