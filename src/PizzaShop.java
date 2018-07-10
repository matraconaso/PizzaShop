import java.util.*;

public class PizzaShop {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String name = sc.next();
        Customer c = new Customer(name);
        String decision ="n";
        String namePizza;
        String sizeP;
        String typePizza;
        String sizePizza = null;
        int numberT;
        List<Pizza> pizzaList = new ArrayList<Pizza>();

        do {
            do {
                System.out.print("Que pizza desea? R:regular , S: Siciliana  ");
                namePizza = sc.next();
            }while (!namePizza.equalsIgnoreCase("R") && !namePizza.equalsIgnoreCase("S"));

            do {
                System.out.print("Tamaño (S pequeño ,M mediano ,L grande o XL extra grande ?:  ");
                sizeP = sc.next();
            }while (!sizeP.equalsIgnoreCase("s") && !sizeP.equalsIgnoreCase("m") &&
                    !sizeP.equalsIgnoreCase("l") && !sizeP.equalsIgnoreCase("xl"));

            if(namePizza.equalsIgnoreCase("r")){
                typePizza = "Regular";
                numberT = 4;
            }else{
                typePizza = "Siciliana";
                numberT = 2;
            }
            List toppingL = new ArrayList();
            for (int i=0; i<numberT; i++) {
                System.out.print("Ingredientes extras (maximo: " + numberT + "):");
                String topPizza = sc.next();

                toppingL.add(topPizza);

            }


            switch (sizeP){
                case "S": case "s":
                    sizePizza ="Small";
                    break;
                case "M": case "m":
                    sizePizza ="Medium";
                    break;
                case "L": case "l":
                    sizePizza ="Large";
                    break;
                case "XL": case "xl":
                    sizePizza ="X-Large";
                    break;
            }
            if(typePizza.equals("Regular")) {
                Regular p = new Regular(sizePizza, typePizza, toppingL);
                pizzaList.add(p);
            }else{
                Siciliana p = new Siciliana(sizePizza, typePizza, toppingL);
                pizzaList.add(p);
            }
            System.out.print("Desea otra pizza? s/n ");
            decision = sc.next();
        } while (decision.equalsIgnoreCase("s"));

        System.out.print("Pedido de: " + c.name);
        Double totalPrice =0.0;
        for (Pizza pizzaL : pizzaList) {
            totalPrice += pizzaL.printPizza();
          }
          System.out.println("\n---------------------------\n");
         System.out.println("Importe total de su pedido : " + totalPrice);

        Collections.sort(pizzaList);
        System.out.print("\n Pedido ORDENADO POR TAMAÑO DE PIZZAS de: " + c.name);
        totalPrice =0.0;
        for (Pizza pizzaL : pizzaList) {
            totalPrice += pizzaL.printPizza();
        }
        System.out.println("\n---------------------------\n");
        System.out.println("Importe total de su pedido : " + totalPrice);
    }
}
