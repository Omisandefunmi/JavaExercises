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
    public void decreaseTemperature(){
    }
    public String getProductName(){ return productName;}
    public int getTemperature() {return temperature;}

    public void increaseTemperature(){
    }
    public void setOn(boolean isOn){
    }
    public void setProductName(String productName){
    }

    public void setTemperature(int temperature) {
    }
}
