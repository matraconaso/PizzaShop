import java.util.ArrayList;
import java.util.List;

public abstract class  Pizza implements Comparable<Pizza>{
    String size;
    int sizeInt;
    String type;
    Double price;
    String shape;
    List<Toppings>  topping = new ArrayList<Toppings>();


    public Pizza(String size, String type, List<Toppings> topping) {
        this.size = size;
        this.type = type;
        if(type.equals("Siciliana")){
            this.price = 20.0;
        }else{
            this.price = 10.0;
        }
        this.topping = topping;
        this.shape = "shape";
        switch (size){
            case "Small":
                sizeInt =1;
                break;
            case "Medium":
                sizeInt =2;
                break;
            case "Large":
                sizeInt =3;
                break;
            case "X-Large":
                sizeInt =4;
                break;
        }

    }

    public Pizza(String shape) {
        this.shape = shape;
    }

    public String getType() {
        return type;
    }

    public Double printPizza(){
        System.out.print("\n Pizza :" + type + " \n Tamaño: " + size
                + " \n forma: "  + shape
                + "\n Toppings: " + topping
                + "\n Price: " + price);
        return price;
    }

    public int compareTo(Pizza t){
        if (sizeInt < t.sizeInt){
            return -1;
        }else if (sizeInt > t.sizeInt) {
            return 1;
        }
        return 0;
    }

}
