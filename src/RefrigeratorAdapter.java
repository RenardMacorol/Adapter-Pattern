public class RefrigeratorAdapter implements PowerOutlet {
	Refrigerator refrigerator;

	RefrigeratorAdapter(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	@Override
	public void plugin() {
		refrigerator.startCooling();
	}

}
