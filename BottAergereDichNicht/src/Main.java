import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public class Main {

	public static void main(String[] args) throws IOException, CsvException {
		Saves s = new Saves();
		//s.saveCSV();
		s.loadCSV(); 
		
		Game g = new Game();
		System.out.println(g.getGameBoard()[0][9]);
		g.printBoard();
		
		for(String e: g.getPosArray()) {
			System.out.println(e);
		}

	}

}