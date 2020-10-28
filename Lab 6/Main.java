public class Main {
    public static void main(String[] args) {
        Printer lineWrappingConsole = new LineWrappingPrinter(new ConsolePrinter(), 5);
        lineWrappingConsole.print("Tom’s labs are the best labs");

        Printer tabbedLineNumberFile = new TabPrinter(new LineNumberPrinter(new FilePrinter("lineNumber.txt")));
        tabbedLineNumberFile.print("Mark");
        tabbedLineNumberFile.print("Sussex");

        Printer uppercaseLineNumberWrappingTabbedConsole = new UpperCasePrinter(
                new LineNumberPrinter(new LineWrappingPrinter(new TabPrinter(new ConsolePrinter()), 3)));

        uppercaseLineNumberWrappingTabbedConsole.print("Hello I am Mark");

        printStuff(new ConsolePrinter());
        printStuff(new TabPrinter(new ConsolePrinter()));

    }

    private static void printStuff(Printer printer) {
        printer.print("Cool");
    }
}
