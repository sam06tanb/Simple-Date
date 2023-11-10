import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat data1F = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat data2F = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date1 = data1F.parse("27/08/2006");
        Date date2 = data2F.parse("27/08/2006 15:42:07");

        System.out.println(data1F.format(date1));
        System.out.println(data2F.format(date2));
        }
    }
