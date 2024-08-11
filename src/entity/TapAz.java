package entity;

public class TapAz extends Person{

    private Integer price;
    private String number;
    private String city;
    private String prodactType;
    private String brand;
    private String model;
    private String color;
    private Integer size;
    private Boolean isNew;
    private Boolean delivery;

    public TapAz(Integer id, String name, String mail, Integer price, String number, String city, String prodactType, String brand, String model, String color, Integer size, Boolean isNew, Boolean delivery) {
        super(id, name, mail);
        this.price = price;
        this.number = number;
        this.city = city;
        this.prodactType = prodactType;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.isNew = isNew;
        this.delivery = delivery;
    }
    public TapAz(){}

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProdactType() {
        return prodactType;
    }

    public void setProdactType(String prodactType) {
        this.prodactType = prodactType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "TapAz{" +
                "\nprice=" + price +
                ", \nnumber='" + number + '\'' +
                ", \ncity='" + city + '\'' +
                ", \nprodactType='" + prodactType + '\'' +
                ", \nbrand='" + brand + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nsize=" + size +
                ", \nisNew=" + isNew +
                ", \ndelivery=" + delivery +
                "} " + super.toString();
    }
}
