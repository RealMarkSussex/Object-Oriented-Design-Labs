public class Main {
    public static void main(String[] args) {
        Printer printer = new LineWrappingPrinter(new ConsolePrinter(), 2);
        printer.print("Tom’s labs are the best labs");
    }
}
