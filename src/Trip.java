import java.util.ArrayList;

public class Trip {
	private DynamicQueue cities;
	private double ticketPrice;
	private Clock departureTime;
	private Bus bus;
	private BusDriver driver;
	private Assistant assistant;
	private Date date;
	private int tripID;
	private ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	private static int countID= 0;

	public Trip(double ticketPrice, Clock departureTime, Bus bus, BusDriver driver, Assistant assistant, Date date) {
		super();
		this.ticketPrice = ticketPrice;
		this.departureTime = departureTime;
		this.bus = bus;
		this.driver = driver;
		this.assistant = assistant;
		this.date = date;
		this.tripID = ++countID;
	}
	
	public void setRoute(String cityName, int hour, int minute) {

        Clock arriveTime = new Clock(hour,minute);
        City cityInfo = new City(cityName, arriveTime);
        cities.enqueue(cityInfo);

    }
	public boolean searchCity(String departureCity, String destinationCity) throws QueueEmpty {

        boolean flag = false;
        int passedCity = 0;

        DynamicQueue temp = cities;
        City currentCity;

        for (int i = 0; i < temp.size(); i++) {

            currentCity = (City) temp.peek();
            if(currentCity.getCityName().equals(departureCity)) {

               for (int j = 0; j < temp.size() - passedCity; j++) {

                   temp.enqueue(temp.dequeue());
                   currentCity = (City) temp.peek();

                   if(currentCity.getCityName().equals(destinationCity)) {
                       flag = true; break;
                   }

               }
               if(flag)
                   break;
            }
            else {
                temp.enqueue(temp.dequeue());
                passedCity++;
            }

        }
        return flag;

    }
	
	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Clock getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Clock departureTime) {
		this.departureTime = departureTime;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public BusDriver getDriver() {
		return driver;
	}

	public void setDriver(BusDriver driver) {
		this.driver = driver;
	}

	public Assistant getAssistant() {
		return assistant;
	}

	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTripID() {
		return tripID;
	}

	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	
	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
}
