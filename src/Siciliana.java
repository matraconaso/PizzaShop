import java.util.List;

public class Siciliana extends Pizza {
    public Siciliana(){
        super("rectangle");
    }
    public Siciliana(String size, String type, List<Toppings> topping) {
        super("rectangle");
        this.size = size;
        this.type = type;
        this.price = 20.0;
        this.topping = topping;
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


}
