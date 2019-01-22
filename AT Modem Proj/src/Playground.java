import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
public class Playground {
	
	private static String Save = "";
	public static void parse(byte[] bytearr) {
			for(int i = 0; i<bytearr.length; i++) {
				Save = Save + (char)bytearr[i];
			if(bytearr[i] == 10) {
				System.out.println(Save);
				Save = "";
			}
		}
	}
	
	private static LocalDateTime modemTime;
	public static void SeperateDate(String ST) {
		String[] parts = ST.split("\"");
		String BigDate = parts[1].toString();
		String[] BigDateParts = BigDate.split(",");
		String Date = BigDateParts[0];
		String[] Dateparts = Date.split("/");
		
		String BigTime = BigDateParts[1];
		String[] Timeparts = BigTime.split("\\+");
		String FinalTime = Timeparts[0].toString();
		String[] FinalTimeparts = FinalTime.split(":");
		//System.out.println(FinalTime);
		
		int Year = Integer.parseInt(Dateparts[0]) + 2000;
		int Month = Integer.parseInt(Dateparts[1]);
		int Day = Integer.parseInt(Dateparts[2]);
		
		int Hour = Integer.parseInt(FinalTimeparts[0]);
		int Minute = Integer.parseInt(FinalTimeparts[1]);
		int Second = Integer.parseInt(FinalTimeparts[2]);

		modemTime = LocalDateTime.of(Year , Month, Day, Hour, Minute, Second);
		//System.out.println(modemTime);
		
		Timer timer = new Timer();
		TimerTask timertask = new TimerTask() {
			@Override
			public void run() {
				modemTime = modemTime.plusSeconds(5);
				System.out.println(modemTime);
			}
		};
		timer.schedule(timertask, 1000L, 5000L);
	}
	
	public static void main(String[] args) throws ParseException {
		String[] buffers = {"OK\r\nRI","NG\r\nO","K\r\n+CL","I","P......\r\n","$GPRMC,,,,","gfdfgfdgfd*54\r\n"};
		for (int i=0;i<buffers.length;i++)
		{
			byte [] temp = buffers[i].getBytes();
			parse(temp);
		}
		
		String Date = "+CCLK: \"18/12/11,16:07:37+08\"";
		SeperateDate(Date);
	}
}
