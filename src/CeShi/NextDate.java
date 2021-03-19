package CeShi;

public class NextDate {
    //获得某年中的某个月份的总天数
    private static int getDays(int year, int month) {
        if (month == 2) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
        } else {
            return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
        }
    }

    //输入参数为年、月、日三个字符串，输出结果为 "YYYY-MM-DD" 格式的下一天日期或 "输入无效" 字符串
    public String nextDate(String yearStr, String monthStr, String dayStr) {
        //判断三个输入值是否存在空值
        if (yearStr == null || monthStr == null || dayStr == null
                || yearStr.trim().equals("") || monthStr.trim().equals("") || dayStr.trim().equals("")) {
            return "输入无效";
        } else {
            yearStr = yearStr.trim();
            monthStr = monthStr.trim();
            dayStr = dayStr.trim();
        }

        //判断是否含有非数字字符
        int year, month, day;
        try {
            year = Integer.parseInt(yearStr);
            month = Integer.parseInt(monthStr);
            day = Integer.parseInt(dayStr);
        } catch (Exception e) {
            return "输入无效";
        }

        //判断各个输入值是否在合法的范围内
        if (year < 1000 || year > 3000) {
            return "输入无效";
        }
        if (month < 1 || month > 12) {
            return "输入无效";
        }
        if (day < 1 || day > getDays(year, month)) {
            return "输入无效";
        }

        //日期向后加一天，然后返回
        day = day + 1;
        if (day > getDays(year, month)) {
            day = 1;
            month = month + 1;
            if (month > 12) {
                month = 1;
                year = year + 1;
            }
        }
        return year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
    }
}
