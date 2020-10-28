public class TabPrinter extends PrinterDecorator {

    public TabPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        super.print("    " + s);
    }
    
}
