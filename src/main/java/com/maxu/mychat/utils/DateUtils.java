package com.maxu.mychat.utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.util.StringUtils;

/**
 * 日期工具
 * 
 * @author MaXU
 *
 */
public class DateUtils {
  static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

  static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

  /**
   * 字符串转日期时间
   * 
   * @param date
   *          一个字符串日期时间
   * @return 如果字符串为空就返回null,否则如果可以转成日期时间就返回日期时间，不能就返回null
   */
  public static Date stringToDateTime(String date) {
    if (!StringUtils.isEmpty(date)) {
      try {
        return format.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
        return null;
      }
    }
    return null;
  }

  /**
   * 字符串转日期
   * 
   * @param date
   *          一个字符串日期
   * @return 如果字符串为空就返回null,否则如果可以转成日期就返回日期，不能就返回null
   */
  public static Date stringToDate(String date) {
    if (!StringUtils.isEmpty(date)) {
      try {
        return dateFormat.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
        return null;
      }
    }
    return null;
  }

  /**
   * 字符串转时间
   * 
   * @param date
   *          一个字符串时间
   * @return 如果字符串为空就返回null,否则如果可以转成时间就返回时间，不能就返回null
   */
  public static Date stringToTime(String date) {
    if (!StringUtils.isEmpty(date)) {
      try {
        return timeFormat.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
        return null;
      }
    }
    return null;
  }

  /**
   * 自定义字符串转日期时间
   * 
   * @param date
   * @param format
   *          自定义日期格式
   * @return
   */
  public static Date stringToDate(String date, String format) {
    if (!StringUtils.isEmpty(date)) {
      try {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
        return null;
      }
    }
    return null;
  }

  /**
   * 获取当前日期时间
   * 
   * @return 如果获取成功就返回当前时间,否则返回null
   */
  public static Date getDateTime() {
    Date date = null;
    try {
      date = format.parse(format.format(new Date()));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
  
  /**
   * 获取当前日期
   * @return 如果获得成功就返回 yyyy-MM-dd,否则返回null
   */
  public static Date getDate(){
    Date date = null;
    try {
      date = dateFormat.parse(dateFormat.format(new Date()));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
  
  /**
   * 获取当前时间
   * @return 如果获得成功就返回 HH:mm:ss,否则返回null
   */
  public static Date getTime(){
    Date date = null;
    try {
      date = timeFormat.parse(timeFormat.format(new Date()));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
  

}
