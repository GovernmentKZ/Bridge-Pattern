public class BankSys extends Program{
    public BankSys(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
