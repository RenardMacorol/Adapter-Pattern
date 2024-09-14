public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);
		Refrigerator refrigerator = new Refrigerator();
		PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter(refrigerator);
		SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();
		PowerOutlet smartPhoneChargerPowerOutlet = new SmartPhoneAdapter(smartPhoneCharger);

		laptopPowerOutlet.plugin();
		refrigeratorPowerOutlet.plugin();
		smartPhoneChargerPowerOutlet.plugin();
	}
}
