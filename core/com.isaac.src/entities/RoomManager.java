package entities;

import resources.Vars;




public class RoomManager {
	
	public Room[] rooms;
	public int count;
	
	//private boolean[][] coordinates;
	private boolean[] tempC = {true, true, true, true};
	private float X, Y;
	
	public RoomManager (int roomCount) {
		this.count = roomCount;
		rooms = new Room[roomCount];
		
		X = Vars.w/Vars.R;
		Y = Vars.h/Vars.R;
		RgenerateRooms();
	}
	
	private void RgenerateRooms () {
		for (int i = 0; i < count; ++i) {
			if (tempC[i]) {
				rooms[i] = new Room(2*i*X, 0*Y);//+X*i, Y);
				System.out.printf("X: %f\nY: %f", X, Y);
			}
			X += Vars.w;
		}
	}
	
}