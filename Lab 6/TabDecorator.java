public class TabDecorator extends PrinterDecorator {

    public TabDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        super.print("    " + s);
    }
    
}
