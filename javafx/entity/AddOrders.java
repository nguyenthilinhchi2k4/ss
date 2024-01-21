package javafx.entity;

public class AddOrders {
    private String fullName;
    private String address;
    private Integer idCar;
    private String days;
    private String nameCar;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return "AddOrders{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", idCar=" + idCar +
                ", days='" + days + '\'' +
                ", nameCar='" + nameCar + '\'' +
                '}';
    }

    public AddOrders(String fullName, String address, Integer idCar, String days, String nameCar) {
        this.fullName = fullName;
        this.address = address;
        this.idCar = idCar;
        this.days = days;
        this.nameCar = nameCar;
    }
}