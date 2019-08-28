<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static int getDateTimeInt(Date date) {
		try {
			return Integer.parseInt(date.getTime()/1000+"");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		
	}
	private static Date add(Date date, int calendarField, int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(calendarField, amount);
            return c.getTime();
        }
    }
	/**
     * 增加天
     * @param date
     * @param amount
     * @return
     */
    public static Date addDays(Date date, int amount) {
        return add(date, 5, amount);
    }
    /**
     * 增加年
     * @param date
     * @param amount
     * @return
     */
    public static Date addYears(Date date, int amount) {
        return add(date, 1, amount);
    }

    /**
     * 增加月
     * @param date
     * @param amount
     * @return
     */
    public static Date addMonths(Date date, int amount) {
        return add(date, 2, amount);
    }

    /**
     * 增加周
     * @param date
     * @param amount
     * @return
     */
    public static Date addWeeks(Date date, int amount) {
        return add(date, 3, amount);
    }
    
    
    //获取当前时间的年月日
    public static Date getDateFromat(Date date,String format) throws ParseException{  
         SimpleDateFormat sdf = new SimpleDateFormat(format);  
         String dateNowStr = sdf.format(date);
    	return sdf.parse(dateNowStr);
    }
    /*
     * 时间戳天数差
     */
    public static int getTimeDay(int time){
    	
    	return (int) (System.currentTimeMillis()/1000 - time) / (1000 * 60);
    }
    /**
     * 时间戳转时间字符串格式
     * @param time
     * @return
     */
    public static String getDateByLong(long time){
    	String str="";
    	Date date=new Date(time);
    	 SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
          str=sf.format(date);
         return str;
    }
    /*
     * long转date-date
     * 
     */
    public static Date longFormatDate(long mseconds){
         return  new java.util.Date(mseconds* 1000);
    }
    
    public static String getDateToString(Date date,String format){
    	try {
    		SimpleDateFormat sf = new SimpleDateFormat(format);
            String str=sf.format(date);
            return str;
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
        
    }
    
    /**
     * 字符串转mysql时间类型
     * @param str
     * @param format
     * @return
     */
    public static Date getStringToDate(String str,String format){
    	try {
    		SimpleDateFormat s = new SimpleDateFormat(format);
    		Date date = s.parse(str);
    		Timestamp createDate = new Timestamp(date.getTime());
    		return createDate;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
        
    }
}
