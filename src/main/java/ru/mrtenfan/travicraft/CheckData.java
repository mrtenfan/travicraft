package ru.mrtenfan.travicraft;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckData {
	
    public static boolean getBoolDate15() {
        SimpleDateFormat dateFormater = new SimpleDateFormat("MM:dd");
        String[] date = dateFormater.format(new Date()).split(":");
        if (date.length == 2 && date[0].equalsIgnoreCase("11") && date[1].equalsIgnoreCase("15"))
            return true;
        else
            return false;
    }
}