package pages;

public class Product {
    private String title;
    private String price;
    private String oldPrice;
    private int discount;

    public String getTitle(){
        return title;
    }
    public void setTitle(String value){
        title = value;
    }
    public String getPrice()
    {
        return price;
    }

    public void setPrice(String value)
    {
        price = value;
    }
    public String getOldPrice()
    {
        return oldPrice;
    }

    public void setOldPrice(String value)
    {
        oldPrice = value;
    }
    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int value)
    {
        discount = value;
    }


}
