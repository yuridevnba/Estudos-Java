package devices;

public class ConcretScanner extends Device implements Scanner{
	
	public ConcretScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override  // sobreescrever
	public void processDoc(String doc) {
		System.out.println("Scanner, vem de DEVICE(processDOC): " + doc);
	}
    @Override
	public String scan() {
		return "Scanned, vem da Interface Scanner(scan) ";
	}
}
