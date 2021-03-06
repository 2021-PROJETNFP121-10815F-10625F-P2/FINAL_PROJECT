package categories.behavioral.State;

/**
 * SoldOutState is concrete classes implementing State interface.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertMoney() {
        System.out.println("You can't insert money, the machine is sold out");
    }
 
    public void ejectMoney() {
        System.out.println("You can't eject, you haven't inserted money yet");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "sold out";
    }
}
