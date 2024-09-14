public class SmartPhoneAdapter implements PowerOutlet {
	SmartPhoneCharger smartPhoneCharger;

	SmartPhoneAdapter(SmartPhoneCharger smartPhoneCharger) {
		this.smartPhoneCharger = smartPhoneCharger;
	}

	@Override
	public void plugin() {
		smartPhoneCharger.chargePhone();
	}

}
