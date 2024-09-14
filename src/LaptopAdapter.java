public class LaptopAdapter implements PowerOutlet {
	Laptop laptop;

	LaptopAdapter(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public void plugin() {
		laptop.charge();
	}

}
