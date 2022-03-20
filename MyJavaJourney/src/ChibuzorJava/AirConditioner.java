package ChibuzorJava;

public class AirConditioner {

    private boolean isOn;
    private String productName;
    private int temperature;
    private String color;

    public AirConditioner(String productName, String color){
        this.productName = productName;
        this.color = color;
    }
    public void decreaseTemperature(int degree){
        if (degree < temperature && temperature >= 16)
            temperature = temperature - 1;
    }
    public String getProductName(){ return productName;}
    public int getTemperature() {return temperature;}

    public void increaseTemperature(int degree){
        if (degree > temperature && temperature <= 30)
            temperature = temperature + 1;
    }
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setTemperature(int temperature) {
        temperature = temperature;
    }
}
