package assignment6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Qus7 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
LocalDateTime now=LocalDateTime.now();
System.out.println(dtf.format(now));
	}

}
