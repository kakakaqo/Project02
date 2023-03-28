package Project02;

public class Bus {

	private String time; // 출발시간
	private String city; // 도시
	private int price; // 가격

	public Bus() {
		super();
	}

	public Bus(String time, String city, int price) {
		super();
		this.time = time;
		this.city = city;
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bus [time=" + time + ", city=" + city + ", price=" + price + "]";
	}
}