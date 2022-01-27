package OOP;

public class City {
    private String Name;
    private int Area;

    public City(String Name, int Area) {
        this.Name = Name;
        this.Area = Area;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public void setArea(int area) {
        Area = area;
    }

    public int getArea(){
        return Area;
    }


    @Override
    public String toString() {
        return "City{" +
                "Name='" + Name + '\'' +
                ", Area='" + Area + '\'' +
                '}';
    }
}
