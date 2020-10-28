public class LineNumberPrinter extends PrinterDecorator {
    
    private int currentLineNumber = 1;
    public LineNumberPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String s) {
        super.print(currentLineNumber + ": " + s + "\n");
        currentLineNumber++;
    }

}
