package cn.jboa.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;


	public class Consertest extends StrutsTypeConverter{
		private final DateFormat[] dfs = {
				new SimpleDateFormat("yyyy年MM月dd日"),
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("MM/dd/yy"),
				new SimpleDateFormat("yyyy.MM.dd"),
				new SimpleDateFormat("yyMMdd"),
				new SimpleDateFormat("yyyy/MM/dd")
		};
		@Override
		public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
			String dateStr = arg1[0]; //获取日期的字符串
			for(int i = 0; i < dfs.length; i++){ //遍历日期支持格式，进行转换			
				try {
					return dfs[i].parse(dateStr);
				} catch (ParseException e) {
					continue;
				}			
			}
			
			//如果遍历完毕后仍没有转换成功，表现出现转换异常
			throw new TypeConversionException();
		}
			
		

		@Override
		public String convertToString(Map arg0, Object arg1) {
			Date date = (Date) arg1;
			//输出的格式是 yyyy-MM-dd
			return new SimpleDateFormat("yyyy-MM-dd").format(date);
		}
		

	}

