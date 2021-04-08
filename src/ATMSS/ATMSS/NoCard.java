package ATMSS.ATMSS;

public class NoCard implements ATMState {
    ATMSS atmMachine;
    public NoCard(ATMSS atmss) {
        atmMachine = atmss;
    }

    @Override
    public void insertCard() {
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card in the Card Reader!");
    }

    @Override
    public void insertPin() {
        System.out.println("No Card in the Card Reader!");
    }
}
