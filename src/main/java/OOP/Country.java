package OOP;

public class Country {
    private String Name;
    private int Area;

    public Country(String Name, int Area) {
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
        return "Country{" +
                "Name='" + Name + '\'' +
                ", Area='" + Area + '\'' +
                '}';
    }
}
