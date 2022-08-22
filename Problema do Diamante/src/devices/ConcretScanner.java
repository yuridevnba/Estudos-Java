package devices;

public class ConcretScanner extends Device implements Scanner{
	
	public ConcretScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override  // sobreescrever
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
    @Override
	public String scan() {
		return "Scanned content";
	}
}
