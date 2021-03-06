<<<<<<< HEAD
package net.jcornelioguzman.projects.seatreservation.domain;

import java.util.HashMap;
import java.util.Map;

import net.jcornelioguzman.projects.seatreservation.util.ReservationConstants;

/**
 * Input Utility for CLI programs
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class SeatBoard {

	private int row;
	private int column;
	private Map<String, Seat> seatMap = new HashMap<String, Seat>();

	public SeatBoard(int row, int column) {
		this.row = row;
		this.column = column;
		populateSeatMap();
	}

	private void populateSeatMap() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {

				String id = String
						.valueOf((char) (ReservationConstants.FIRST_ROW + i))
						+ String.valueOf(j);

				Seat seat = new Seat();
				seat.setColumn(j);
				seat.setRow((char) (ReservationConstants.FIRST_ROW + i));
				seat.setSeatId(id);
				seat.setReserved(false);

				seatMap.put(id, seat);
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {
				String id = String
						.valueOf((char) (ReservationConstants.FIRST_ROW + i))
						+ String.valueOf(j);
				System.out.print(seatMap.get(id).getDisplay() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public Seat getSeat(String id) {
		return seatMap.get(id);
	}
=======
package net.jcornelioguzman.projects.seatreservation.domain;

import java.util.HashMap;
import java.util.Map;

import net.jcornelioguzman.projects.seatreservation.util.ReservationConstants;

/**
 * Input Utility for CLI programs
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class SeatBoard {

	private int row;
	private int column;
	private Map<String, Seat> seatMap = new HashMap<String, Seat>();

	public SeatBoard(int row, int column) {
		this.row = row;
		this.column = column;
		populateSeatMap();
	}

	private void populateSeatMap() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {

				String id = String
						.valueOf((char) (ReservationConstants.FIRST_ROW + i))
						+ String.valueOf(j);

				Seat seat = new Seat();
				seat.setColumn(j);
				seat.setRow((char) (ReservationConstants.FIRST_ROW + i));
				seat.setSeatId(id);
				seat.setReserved(false);

				seatMap.put(id, seat);
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {
				String id = String
						.valueOf((char) (ReservationConstants.FIRST_ROW + i))
						+ String.valueOf(j);
				System.out.print(seatMap.get(id).getDisplay() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public Seat getSeat(String id) {
		return seatMap.get(id);
	}
>>>>>>> 9184d66d7c071cc3cddb2112ef94d5856997cfa5
}