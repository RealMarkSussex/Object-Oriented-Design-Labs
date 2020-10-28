public class LineWrappingPrinter extends PrinterDecorator {

    private int wrapNumber;
    public LineWrappingPrinter(Printer printer, int wrapNumber) {
        super(printer);
        this.wrapNumber = wrapNumber;
    }
    
    @Override
    public void print(String s) {
        String stringToPrint = "";
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % wrapNumber == 0) {
                stringToPrint += s.charAt(i) + "\n";
            } else {
                stringToPrint += s.charAt(i);
            }
        }
        super.print(stringToPrint);
    }
}
