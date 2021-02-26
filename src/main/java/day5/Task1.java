package day5;

public class Task1 {
    public static void main(String[] args) {
        Car Lamba = new Car();
        Lamba.setYearOfRelease(2021);
        Lamba.setColor("Черный");
        Lamba.setModel("Lambo Aventador");
        System.out.println("Год выпуска: " + Lamba.getYearOfRelease());
        System.out.println("Цвет: " + Lamba.getColor());
        System.out.println("Модель: " + Lamba.getModel());

    }
}
class Car {
    private int yearOfRelease;
    private String color;
    private String Model;

    public void setYearOfRelease(int year){
        this.yearOfRelease = year;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String m){
        this.Model = m;
    }
    public String getModel() {
        return Model;
    }
}
