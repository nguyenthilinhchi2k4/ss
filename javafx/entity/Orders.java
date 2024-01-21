package javafx.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Orders {

    private String FullName;
    private LocalDate DOB;

    private String Car;
    private String Days;
    private String Price;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String car) {
        Car = car;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "FullName='" + FullName + '\'' +
                ", DOB=" + DOB +
                ", Car='" + Car + '\'' +
                ", Days='" + Days + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return Objects.equals(getFullName(), orders.getFullName()) && Objects.equals(getDOB(), orders.getDOB()) && Objects.equals(getCar(), orders.getCar()) && Objects.equals(getDays(), orders.getDays()) && Objects.equals(getPrice(), orders.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getDOB(), getCar(), getDays(), getPrice());
    }

    public Orders(String fullName, LocalDate DOB, String car, String days, String price) {
        FullName = fullName;
        this.DOB = DOB;
        Car = car;
        Days = days;
        Price = price;
    }
}
