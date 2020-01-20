package javaClient;

public class client {
	
	
	public static void main(String[] args) {
		javaClient.Hotel hotel = new javaClient.HotelService().getHotelPort();
		System.out.println("Prix = " + hotel.getChambre(1).getPrix());
		System.out.println("Type = " + hotel.getChambre(1).getType());

	}
}
