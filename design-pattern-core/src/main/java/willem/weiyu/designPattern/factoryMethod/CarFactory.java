package willem.weiyu.designPattern.factoryMethod;

public class CarFactory {

    public ICar getCar(String carName){
        switch (carName){
            case "SUV":
                return new SUV();
            case "EV":
                return new EV();
            case "Sedan":
                return new Sedan();
            default:
                System.out.println("======no car to use");
                break;
        }
        return null;
    }
}
