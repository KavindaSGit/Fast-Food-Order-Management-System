package pos;

import java.util.HashMap;

abstract class Food {

    public int getId() {
        return 0;
    }

    public abstract String getName();

    public abstract double getPrice();
}

class ZingerRiceWrapCombo extends Food {

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "Zinger Rice Wrap Combo";
    }

    @Override
    public double getPrice() {
        return 1500;
    }

 
}

class OnePCSetCombo extends Food {

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public String getName() {
        return "1PC Set Combo";
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}

class TwoPCSetCombo extends Food {

    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String getName() {
        return "2PC Set Combo";
    }

    @Override
    public double getPrice() {
        return 1350;
    }
}

class DinnerPlate extends Food {

    @Override
    public int getId() {
        return 4;
    }

    @Override
    public String getName() {
        return "Dinner Plate";
    }

    @Override
    public double getPrice() {
        return 2500;
    }
}

class MiniBucket extends Food {

    @Override
    public int getId() {
        return 5;
    }

    @Override
    public String getName() {
        return "Mini Bucket";
    }

    @Override
    public double getPrice() {
        return 2000;
    }
}

class ColonelBurger extends Food {

    @Override
    public int getId() {
        return 6;
    }

    @Override
    public String getName() {
        return "Colonel Burger";
    }

    @Override
    public double getPrice() {
        return 800;
    }
}

class ZingerBurger extends Food {

    @Override
    public int getId() {
        return 7;
    }

    @Override
    public String getName() {
        return "Zinger Burger";
    }

    @Override
    public double getPrice() {
        return 900;
    }
}

class ZingerCombo extends Food {

    @Override
    public int getId() {
        return 8;
    }

    @Override
    public String getName() {
        return "Zinger Combo";
    }

    @Override
    public double getPrice() {
        return 1600;
    }
}

class ZingerWrap extends Food {

    @Override
    public int getId() {
        return 9;
    }

    @Override
    public String getName() {
        return "Zinger Wrap";
    }

    @Override
    public double getPrice() {
        return 600;
    }
}

//Decorator class
abstract class FoodDecorator extends Food {

    Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }
}

class ChilliSause extends FoodDecorator {

    public ChilliSause(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Chilli Sause";
    }

    @Override
    public double getPrice() {
        return 150;
    }

}

class TomatoSause extends FoodDecorator {

    public TomatoSause(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Tomato Sause";
    }

    @Override
    public double getPrice() {
        return 150;
    }

}

class Mayonnaise extends FoodDecorator {

    public Mayonnaise(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Mayonnaise";
    }

    @Override
    public double getPrice() {
        return 175;
    }

}

class UltraChilliSause extends FoodDecorator {

    public UltraChilliSause(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Ultra Chilli Sause";
    }

    @Override
    public double getPrice() {
        return 200;
    }

}

class MozarallaCheese extends FoodDecorator {

    public MozarallaCheese(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Mozaralla Cheese";
    }

    @Override
    public double getPrice() {
        return 250;
    }

}

class CheeseSlice extends FoodDecorator {

    public CheeseSlice(Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return "Cheese Slice";
    }

    @Override
    public double getPrice() {
        return 250;
    }

}

public class Decorator {

    public static void main(String[] args) {
        Food food1 = new ZingerRiceWrapCombo();
        System.out.println(food1.getName() + " : " + food1.getPrice());

        food1 = new ChilliSause(food1);
        System.out.println(food1.getName() + " : " + food1.getPrice());

    }

}
