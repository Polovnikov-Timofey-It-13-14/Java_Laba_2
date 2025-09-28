public class Name {
    private String name;
    private String surname;
    private String patronymic;

    //Конструкторы
    public Name(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Name(String surname, String name) {
        this(surname, name, null);
    }

    public Name(String name) {
        this(null, name, null);
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String Surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (surname != null && !surname.trim().isEmpty()) {
            result.append(surname);
        }

        if (name != null && !name.trim().isEmpty()) {
            if (!result.isEmpty())
                result.append(" ");
            result.append(name);
        }

        if (patronymic != null && !patronymic.trim().isEmpty()) {
            if (!result.isEmpty())
                result.append(" ");
            result.append(patronymic);
        }

        return result.toString();
    }
}
