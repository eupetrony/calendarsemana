import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GenericCalendar {
    /**
     * Retorna ano mes e dia sem o caractere /
     * 
     * @param calendar
     * @return String
     * @throws Exception
     */
    public static String getYYYYMMMDD(Calendar calendar) throws Exception {
        SimpleDateFormat formataData = new SimpleDateFormat("yyyyMMdd");
        String anoFormatado = formataData.format(calendar.getTime());
        return anoFormatado;
    }
    
    /**
     * Retorna ano Ano e mes sem o caractere /
     * @param calendar
     * @return String
     * @throws Exception 
     */
    public static String getYYYYMMM(Calendar calendar) throws Exception {
        SimpleDateFormat formataData = new SimpleDateFormat("yyyyMM");
        String anoFormatado = formataData.format(calendar.getTime());
        return anoFormatado;
    }
    
    public static Calendar getInicioSemana(Calendar dataAtual) throws Exception {
        GregorianCalendar c = new GregorianCalendar();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(dataAtual.getTime());

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        c.set(Calendar.AM_PM, Calendar.AM);
        c.set(Calendar.HOUR, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);

        return c;
    }

    public static Calendar getFinalDaSemana(Calendar dataAtual) throws Exception {
        GregorianCalendar c = new GregorianCalendar();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(dataAtual.getTime());

        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        c.set(Calendar.AM_PM, Calendar.PM);
        c.set(Calendar.HOUR, 11);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);

        return c;
    }
}
