package OOP;

public class Automobile {
    private String Name;
    private String Manufacturer ;
    private int YearOfIssue;
    private Double EngineCapacity;

    public Automobile(String Name, String Manufacturer, int YearOfIssue, Double EngineCapacity) {
        this.Name = Name;
        this.Manufacturer = Manufacturer;
        this.YearOfIssue = YearOfIssue;
        this.EngineCapacity = EngineCapacity;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getManufacturer(){
        return Manufacturer;
    }

    public void setYearOfIssue(int YearOfIssue) {
        this.YearOfIssue = YearOfIssue;
    }

    public int getYearOfIssue(){
        return YearOfIssue;
    }

    public void setEngineCapacity(Double EngineCapacity) {
        this.EngineCapacity = EngineCapacity;
    }

    public Double getEngineCapacity(){
        return EngineCapacity;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "Name='" + Name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Year of issue='" + YearOfIssue + '\'' +
                ", Engine capacity='" + EngineCapacity + '\'' +
                '}';
    }
}
