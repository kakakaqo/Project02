package Project02;

public class Airplane {

	private String time; // 출발시간
	private String country; // 나라
	private int price; // 가격

	public Airplane() {
		super();
	}

	public Airplane(String time, String country, int price) {
		super();
		this.time = time;
		this.country = country;
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Airplane [time=" + time + ", country=" + country + ", price=" + price + "]";
	}
}