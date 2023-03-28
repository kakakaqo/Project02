package Project02;

import java.util.ArrayList;
import java.util.List;



public class DatabaseClass {

	public List<Train> train = new ArrayList<>();
	public List<Bus> bus = new ArrayList<>();
	public List<Airplane> airplane = new ArrayList<>();
	
	public List<Train> getTrain() {
		return train;
	}
	public void setTrain(List<Train> train) {
		this.train = train;
	}
	
	public List<Bus> getBus() {
		return bus;
	}
	
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	
	public List<Airplane> getAirplane() {
		return airplane;
	}
	
	public void setAirplane(List<Airplane> airplane) {
		this.airplane = airplane;
	}
	
	public void addTrain(Train train) {
		this.train.add(train);
	}
	
	public void addBus(Bus bus) {
		this.bus.add(bus);
	}
	
	public void addAirplane(Airplane airplane) {
		this.airplane.add(airplane);
	}
	
	public int getTarinCount() {
		return train.size();
	}
	
	public int getBusCount() {
		return bus.size();
	}
	
	public int getAirplaneCount() {
		return airplane.size();
	}
	
}