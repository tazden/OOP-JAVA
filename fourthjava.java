public class fourthjava {
    public static void main(String[] args){
    String[] array ;
    Reader r1=new Reader("Петя","Иванов","Вениаминович","РНИГМ","12.10.2003",89870311083L);
    r1.takeBook(6);
    r1.takeBook("Апокалипсис","Огненный шар");
    Book b1=new Book("Чехов","Вищневый сад");
    Book b2=new Book("Тургенев","Отцы и дети");
    r1.takeBook(b1.picture,b2.picture);
    }
}
class Reader {
    String name;
    String surname;
    String patronymic;
    String faculty;
    String birthday;
    long number;

    Reader(String name, String surname, String patronymic, String faculty, String birthday, long number) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.birthday = birthday;
        this.number = number;
    }

    void takeBook(int count) {
        switch (count) {
            case 2:
                System.out.println(name + " " + surname.charAt(0) + "." + patronymic.charAt(0) + " Взял из библиотеки " + count + " книги");
                break;
            case 3:
                System.out.println(name + " " + surname.charAt(0) + "." + patronymic.charAt(0) + " Вытащил из библиотеки " + count + " книги");
                break;
            case 4:
                System.out.println(name + " " + surname.charAt(0) + "." + patronymic.charAt(0) + " Забрал из библиотеки " + count + " книги");
                break;
            default:
                System.out.println(name + " Взял из библиотеки " + count + " книг");
        }
    }

    void takeBook(String... r) {
        System.out.print(name + " " + surname.charAt(0) + "." + patronymic.charAt(0) + ". Взял такие книги: ");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + ' ');
        }
        System.out.println();
    }

    void takeBook(Book... b) {
        System.out.print(name + " " + surname.charAt(0) + "." + patronymic.charAt(0) + ". Взял такие книги: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+", ");
        }
    }
}
class Book{
    String autor;
    String picture;
    Book(String autor,String picture){
        this.autor=autor;
        this.picture=picture;
    }
}
