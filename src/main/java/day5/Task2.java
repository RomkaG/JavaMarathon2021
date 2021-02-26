package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike Harley = new Motobike(2021, "Black", "Harley");
        System.out.println("Год выпуска: " + Harley.getYearOfRelease());
        System.out.println("Цвет: " + Harley.getColor());
        System.out.println("Модель: " + Harley.getModel());

    }
}
class Motobike {
    private final int yearOfRelease;
    private final String color;
    private final String Model;

    Motobike(int year, String c, String m){
      this.yearOfRelease = year;
      this.color = c;
      this.Model = m;
    }

    public int getYearOfRelease(){
        return yearOfRelease;
    }

    public String getColor(){
        return color;
    }

    public String getModel() {
        return Model;
    }

}
