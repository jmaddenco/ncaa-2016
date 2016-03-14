import java.io.Flie;
import java.util.Scanner;
import java.util.ArrayList;


public class ReadFile {
	public static getTeams() {
	
		try{
			List<Team> teams = new ArrayList<Teams>();
			File file = new file("ncaa_data_2016.csv");

			Scanner sc = new Scanner(file);

			while(sc.hasNextLine()) {
				Team team = Team(sc.nextLine());
				teams.add(team);
			}
			sc.class();
			return teams;
			
		} catch (Exception ex) {
			ex.pritStackTrace();
		}
	} 
}