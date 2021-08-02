import java.util.ArrayList;
import java.util.Scanner;

public class Management {
	
	static ArrayList<Bus> busList = new ArrayList<Bus>();
    static ArrayList<Shuttle> shuttleList = new ArrayList<Shuttle>();
    static ArrayList<BusDriver> busDriverList = new ArrayList<BusDriver>();
    static ArrayList<Assistant> assistantList = new ArrayList<Assistant>();
    static ArrayList<TicketAgent> ticketAgentList = new ArrayList<TicketAgent>();
    static ArrayList<Member> memberList = new ArrayList<Member>();
    static ArrayList<Office> officeList = new ArrayList<Office>();
    static ArrayList<Trip> tripList = new ArrayList<Trip>();
	
    static Scanner scn = new Scanner(System.in);
	
	
	//****************** Add **************************
    
    public static void addVehicle(String vehicleType, String plate, int numberOfSeats, String type, boolean wifi, boolean tv, boolean plug, String size) {
    	
    	if(vehicleType.equalsIgnoreCase("BUS")) {
    		
    		VehicleFactory vehicleFactory = new VehicleFactory();
    		Bus newBus = (Bus) vehicleFactory.getVehicle("BUS", plate, numberOfSeats,type, wifi, tv, plug, size);
    		busList.add(newBus);
    	}
    	else if(vehicleType.equalsIgnoreCase("SHUTTLE")) {
    		
    		VehicleFactory vehicleFactory = new VehicleFactory();
    		Shuttle newShuttle = (Shuttle) vehicleFactory.getVehicle("SHUTTLE", plate, numberOfSeats, type, wifi, tv, plug, size);
    		shuttleList.add(newShuttle);
    	}
    		
	}
//    public static void addBus(String plate, int numberOfSeat, String type, boolean wifi, boolean tv, boolean plug) {
//		Bus newBus = new Bus(plate, numberOfSeat, type,wifi, tv, plug);
//		busList.add(newBus);
//	}
//	public static void addShuttle(String plate, int numberOfSeat, String size) {
//		Shuttle newShuttle = new Shuttle(plate, numberOfSeat, size);
//		shuttleList.add(newShuttle);
//	}
	public static void addMember(String name, String surname, String email, Phone phone, String gender, Date birthdate, Address address) {
		Member newMember = new Member(name, surname, email, phone, gender, birthdate, address);
	    memberList.add(newMember);
	}
	public static void addBusDriver(String name, String surname, String email, Phone phone, Address address, String gender, int salary, Date birthdate) {
	
		BusDriver newBusDriver = new BusDriver(name, surname, email, phone, address, gender, salary, birthdate);
		busDriverList.add(newBusDriver);
	}
	public static void  addAssistant(String name, String surname, String email, Phone phone, Address address, String gender, int salary, Date birthdate) {
	
		Assistant newAssistant = new  Assistant(name, surname, email, phone, address,gender, salary, birthdate);
		assistantList.add(newAssistant);
		
	}
	public static void addTicketAgent(String name, String surname, String email, Phone phone, Address address, String gender, int salary, Date birthdate, int officeID) {
	
		TicketAgent newTicketAgent = new TicketAgent(name, surname, email,phone, address, gender,salary, birthdate, officeID);
		ticketAgentList.add(newTicketAgent);
	}
	public static void addOffice(String officeName, int adminID, Address address, Phone phone) {
	
		Office newOffice = new Office(officeName, adminID, address, phone);
		officeList.add(newOffice);
	}
	public static void addTrip(double ticketPrice, Clock departureTime, int busID, int driverID, int assistantID, Date date) {
	       try {
	        BusDriver driver= null;
	        for (int i = 0; i < busDriverList.size(); i++) {
	            if(busDriverList.get(i).getDriverID() == driverID && !(busDriverList.get(i).isUnderWay())) {
	                busDriverList.get(i).setUnderWay(true);
	                driver = busDriverList.get(i);
	            }
	        }
	        Assistant assistant= null;
	        for (int i = 0; i < assistantList.size(); i++) {
	            if(assistantList.get(i).getAssistantID() == assistantID && !(assistantList.get(i).isUnderWay())) {
	                assistantList.get(i).setUnderWay(true);
	                assistant = assistantList.get(i);
	            }
	        }
	        Bus bus= null;
	        for (int i = 0; i < busList.size(); i++) {
	            if(busList.get(i).getVehicleID() == busID) {
	                bus = busList.get(i);
	            }
	        }
	        Trip newTrip = new Trip(ticketPrice, departureTime, bus, driver, assistant, date);
	        boolean exit = true;
	        do {
				String city = scn.next();
				int hour = scn.nextInt();
				int minute = scn.nextInt();
				newTrip.setRoute(city, hour, minute);
				int exitN = scn.nextInt();
				if(exitN == 0)
					exit = false;
			} while (exit); //will be changed
	        
	        tripList.add(newTrip);
	       }
	       catch(Exception e) {
	           System.out.println();
	           System.out.println("....");
	           System.out.println();
	       }
	    }
	public static void addTicket(String status, boolean isMember, Member member, NonMember nonMember, int tripID, int ticketID, int seatID) {
		
		for (int i = 0; i < tripList.size(); i++) {
			if (tripList.get(i).getTripID() == tripID) {
				if(tripList.get(i).getBus().isSeatAvailable(seatID)) {
					Ticket newTicket = new Ticket(status, isMember, member, nonMember, tripID, ticketID, seatID);
					tripList.get(i).getTicketList().add(newTicket);
				}
			}
		}
	}
	
	//******************* Delete *********************
	public static void deleteBus(int busID) {
		try {
			for (int i = 0; i < busList.size(); i++) {
				if (busList.get(i).getVehicleID() == busID) {
					busList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + busID + " Not found");
			System.out.println();
		}
	}
	
	public static void deleteShuttle(int shuttleID) {
		try {
			for (int i = 0; i < shuttleList.size(); i++) {
				if (shuttleList.get(i).getVehicleID() == shuttleID) {
					shuttleList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + shuttleID + " Not found");
			System.out.println();
		}
	}
	public static void deleteOffice(int officeID) {
		try {
			for (int i = 0; i < officeList.size(); i++) {
				if (officeList.get(i).getOfficeID() == officeID) {
					officeList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + officeID + " Not found");
			System.out.println();
		}
	}
	public static void deleteTrip(int tripID) {
		try {
			for (int i = 0; i < tripList.size(); i++) {
				if (tripList.get(i).getTripID() == tripID) {
					for (int j = 0; j < busDriverList.size(); j++) {
						if(tripList.get(i).getDriver().getDriverID() == busDriverList.get(j).getDriverID())
							busDriverList.get(j).setUnderWay(false);
					}
					for (int j = 0; j < assistantList.size(); j++) {
						if(tripList.get(i).getAssistant().getAssistantID() == assistantList.get(j).getAssistantID())
							assistantList.get(j).setUnderWay(false);
					}
					tripList.get(i).getBus().clearSeat();
					tripList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + tripID + " Not found");
			System.out.println();
		}
	}
	public static void deleteTicket(int tripID, int ticketID) {
		for (int i = 0; i < tripList.size(); i++) {
			if (tripList.get(i).getTripID() == tripID) {
				for (int j = 0; j < tripList.get(i).getTicketList().size(); j++) {
					if(tripList.get(i).getTicketList().get(j).getTicketID() == ticketID) {
						tripList.get(i).getTicketList().remove(j);
						System.out.println("ticket is succesfully deleted");
					}
				}
				
			}
		}
	}
	public static void deleteMember(int memberID) {
		try {
			for (int i = 0; i < memberList.size(); i++) {
				if (memberList.get(i).getMemberID() == memberID) {
					memberList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + memberID + " Not found");
			System.out.println();
		}
	}
	public static void deleteBusDriver(int busDriverID) {
		try {
			for (int i = 0; i < busDriverList.size(); i++) {
				if (busDriverList.get(i).getDriverID() == busDriverID) {
					busDriverList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + busDriverID + " Not found");
			System.out.println();
		}
	}
	public static void deleteAssistant(int assistantID) {
		try {
			for (int i = 0; i < assistantList.size(); i++) {
				if (assistantList.get(i).getAssistantID() == assistantID) {
					assistantList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + assistantID + " Not found");
			System.out.println();
		}
	}
	public static void deleteTicketAgent(int agentID) {
		try {
			for (int i = 0; i < ticketAgentList.size(); i++) {
				if (ticketAgentList.get(i).getAgentID() == agentID) {
					ticketAgentList.remove(i);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + agentID + " Not found");
			System.out.println();
		}
	}
	
	//********************* Display ********************
	public static void displayBusses(){

        for (int i = 0; i < busList.size(); i++)
            System.out.println(busList.get(i).toString());

    }
    public void displayShuttles(){

        for (int i = 0; i < shuttleList.size(); i++)
            System.out.println(shuttleList.get(i).toString());

    }
    public void displayBusDrivers(){

        for (int i = 0; i < busDriverList.size(); i++)
            System.out.println(busDriverList.get(i).toString());

    }
    public void displayAssistants(){

        for (int i = 0; i < assistantList.size(); i++)
            System.out.println(assistantList.get(i).toString());

    }
    public void displayTicketAgents(){

        for (int i = 0; i < ticketAgentList.size(); i++)
            System.out.println(ticketAgentList.get(i).toString());

    }
    public void displayMembers(){

        for (int i = 0; i < memberList.size(); i++)
            System.out.println(memberList.get(i).toString());

    }
    public void displayOffices(){

        for (int i = 0; i < officeList.size(); i++)
            System.out.println(officeList.get(i).toString());

    }
    public void displayTrips(){
    	for (int i = 0; i < tripList.size(); i++) {
			System.out.println(tripList.get(i).toString());
		}
    }
    public void displaySeats(int tripID){
    	
    	for (int i = 0; i < tripList.size(); i++) {
			if (tripList.get(i).getTripID() == tripID) {
				Seat[] temp = tripList.get(i).getBus().getSeats();
				for (int j = 0; j < temp.length; j++) {
					if(temp[j].isAvailable()) {
						System.out.println(temp[j].getSeatID());
					}
				}
			}
		}
    }
    public void displayTickets (int tripID) {
    	for (int i = 0; i < tripList.size(); i++) {
			if (tripList.get(i).getTripID() == tripID) {
				for (int j = 0; j < tripList.get(i).getTicketList().size(); j++) {
					System.out.println(tripList.get(i).getTicketList().get(j).toString());
				}
			}
		}
    }
    
    
	//******************* Search ************************
   public void searchBus(int BusID) {
	   for (int i = 0; i <busList.size(); i++) {
		   if(busList.get(i).getVehicleID() == BusID)
			   System.out.println(busList.get(i).toString());
	   }
   }
   public void searchShuttle(int shuttleID) {
	   for (int i = 0; i <shuttleList.size(); i++) {
		   if(shuttleList.get(i).getVehicleID() == shuttleID)
			   System.out.println(shuttleList.get(i).toString());
	   }
   }
   public void searchBusDriver(int busdriverID) {
	   for (int i = 0; i <busDriverList.size(); i++) {
		   if(busDriverList.get(i).getDriverID() == busdriverID)
			   System.out.println(busDriverList.get(i).toString());
	   }
   }
   public void searchAssistant(int assisstantID) {
	   for (int i = 0; i <assistantList.size(); i++) {
		   if(assistantList.get(i).getAssistantID() == assisstantID)
			   System.out.println(assistantList.get(i).toString());
	   }
   }
   public void searchTicketAgent(int agentID) {
	   for (int i = 0; i <ticketAgentList.size(); i++) {
		   if(ticketAgentList.get(i).getAgentID() == agentID)
			   System.out.println(ticketAgentList.get(i).toString());
	   }
   }
   public void searchMember(int memberID) {
	   for (int i = 0; i <memberList.size(); i++) {
		   if(memberList.get(i).getMemberID() == memberID)
			   System.out.println(memberList.get(i).toString());
	   }
   }
    public static void searchTrip(Date date, String departure, String destination) throws QueueEmpty {

        for (int i = 0; i < tripList.size(); i++) {

            if(date.equals(tripList.get(i).getDate())) {

                if(tripList.get(i).searchCity(departure, destination))
                    System.out.println(tripList.get(i).toString());

            }

        }

    }
    public void searchOffice(int officeID){
    	for (int i = 0; i <officeList.size(); i++) {
 		   if(officeList.get(i).getOfficeID() == officeID)
 			   System.out.println(officeList.get(i).toString());
 	   }
    }
	
	
	
	
	
	
	
}
