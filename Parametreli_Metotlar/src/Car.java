
public class Car {

		String car_color;
		String car_model;
		String car_modelyear;
		int car_age;
		double car_price;
public Car(String car_color, String car_model, String car_modelyear, int car_age, double car_price) 
		{
		this.car_color = car_color;
		this.car_model = car_model;
		this.car_modelyear = car_modelyear;
		this.car_age = car_age;
		this.car_price = car_price;
		}
		
	public String araba_renk_model_modelyılı(String car_color,String car_model,String car_modelyear) {
	
		return car_color+" "+car_model+" "+car_modelyear;

	}	
	
	

		
}
