package junit;

public class NextDate {
    public static String nextDate(int day, int month, int year) {
        // Kiểm tra các ràng buộc của ngày, tháng và năm
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812) {
            throw new IllegalArgumentException("Ngày, tháng hoặc năm không hợp lệ.");
        }

        // Kiểm tra tháng 2 trong trường hợp năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDayOfMonth = 31;
        if (month == 2) {
            maxDayOfMonth = isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDayOfMonth = 30;
        }

        // Kiểm tra ngày có hợp lệ không
        if (day < 1 || day > maxDayOfMonth) {
            throw new IllegalArgumentException("Ngày không hợp lệ cho tháng và năm đã cho.");
        }

        // Tìm ngày kế tiếp
        if (day < maxDayOfMonth) {
            return (day + 1) + "/" + month + "/" + year;
        } else if (month < 12) {
            return "1/" + (month + 1) + "/" + year;
        } else {
            return "1/1/" + (year + 1);
        }
    }
}
