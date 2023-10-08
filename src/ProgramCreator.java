public class ProgramCreator {
    public static void main(String[] args) {

        Program[] programs = {
                new BankSys(new CppDev()),
                new StockExchange(new JavaDev())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
