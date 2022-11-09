package devices;

public class ConcretPrinter extends Device implements Printer{
	
	public ConcretPrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("vem de Device(processDoc) " + doc);
	}
    @Override
	public void print(String doc) {
		System.out.println("vem da InterfacePrint(print) " + doc);
	}
}
