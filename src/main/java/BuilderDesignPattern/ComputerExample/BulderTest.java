package BuilderDesignPattern.ComputerExample;

public class BulderTest {

	public static void main(String[] args) {
		Computer.ComputerBuilder builder = new Computer.ComputerBuilder("500 GB", "2 GB");
		Computer comp = builder
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		System.out.println(comp.getHDD());
		System.out.println(comp.getRAM());
	}

}
