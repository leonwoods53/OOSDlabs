package lab2;

public class HotelRoom {
	public HotelRoom() {
	
		private int roomNumber;
	
		public int getroomNumber() {
			return roomNumber;
		}
		public void setroomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		
		
	private String roomType;
			
		public String getRoomType() {
				return roomType;
		}
		public void setRoomType(String roomType) {
				this.roomType = roomType;
		}
			
		
		

	public static void main(String args[]) {
		HotelRoom roomA = new HotelRoom(200);
		HotelRoom roomB = new HotelRoom(201);
		System.out.println(roomA + "is a single room");
		System.out.println(roomB + "is a double room");
		
		}
		
	}
}