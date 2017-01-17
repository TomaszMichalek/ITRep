package v8.application;

public class CarShopApp {

	public static void main(String[] args) {
		
		final String appName = "CarShop v0.8";
        System.out.printf("%22s", appName);
		CarShopControl carShopControl = new CarShopControl();
		carShopControl.controlLoop();
	}
}