import java.util.List;

public class Regular extends Pizza {
    public Regular(){
        super("circle");
    }
    public Regular(String size, String type, List<Toppings> topping) {
        super("circle");
        this.size = size;
        this.type = type;
        this.price = 10.0;
        this.topping = topping;
        switch (size) {
            case "Small":
                sizeInt = 1;
                break;
            case "Medium":
                sizeInt = 2;
                break;
            case "Large":
                sizeInt = 3;
                break;
            case "X-Large":
                sizeInt = 4;
                break;
        }
    }
}
