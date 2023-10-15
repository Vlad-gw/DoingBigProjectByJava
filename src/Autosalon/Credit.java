package Autosalon;

public class Credit {

    Auto car = new Auto();
    static int downPayment; // первый взнос
    public static int month;
    final float percent = 0.1f;

    public Credit(int downPayment, int month) {
        Credit.downPayment = downPayment;
        Credit.month =month;
    }

    public float creditСalculation(){
        return car.cost- (car.cost - downPayment)*percent;
    }

    public int countMonth(){
        return (int) (creditСalculation()/month);
    }
}
