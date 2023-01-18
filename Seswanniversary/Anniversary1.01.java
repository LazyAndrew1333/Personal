// July 1, 2021 @2:03pm

import java.util.Scanner;

public class Anniversary {

// ------------------------------------------------------------------ || Variables || ------------------------------------------------------------------ \\
    public static final int startingMonth   = 7;
    public static final int startingDate    = 1;
    public static final int startingYear    = 2021;
    public static final int StartingDay     = 5;

    public static int month                 = startingMonth;
    public static int date                  = startingDate;
    public static int year                  = startingYear;
    public static int day                   = StartingDay;
    public static String[] dayString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static int monthsPassed          = 0;
    public static int datesPassed           = 0;
    public static int yearsPassed           = 0;

    public static int hour                  = 14;
    public static int minute                = 3;

    public static String inputMonth         = "";
    public static int inputMonthToInt       = 0;
    public static int inputDate             = 0;
    public static int inputYear             = 0;
    public static boolean isDateValid       = false;
// ----------------------------------------------------------------------------------------------------------------------------------------------------- \\

// ------------------------------------------------------------------- || Methods || ------------------------------------------------------------------- \\
    public static void convertMonth() {
        if (inputMonth.equalsIgnoreCase("january")          || inputMonth.equals("1"))  {
            inputMonthToInt = 1;
        } else if (inputMonth.equalsIgnoreCase("february")  || inputMonth.equals("2"))  {
            inputMonthToInt = 2;
        } else if (inputMonth.equalsIgnoreCase("march")     || inputMonth.equals("3"))  {
            inputMonthToInt = 3;
        } else if (inputMonth.equalsIgnoreCase("april")     || inputMonth.equals("4"))  {
            inputMonthToInt = 4;
        } else if (inputMonth.equalsIgnoreCase("may")       || inputMonth.equals("5"))  {
            inputMonthToInt = 5;
        } else if (inputMonth.equalsIgnoreCase("june")      || inputMonth.equals("6"))  {
            inputMonthToInt = 6;
        } else if (inputMonth.equalsIgnoreCase("july")      || inputMonth.equals("7"))  {
            inputMonthToInt = 7;
        } else if (inputMonth.equalsIgnoreCase("august")    || inputMonth.equals("8"))  {
            inputMonthToInt = 8;
        } else if (inputMonth.equalsIgnoreCase("september") || inputMonth.equals("9"))  {
            inputMonthToInt = 9;
        } else if (inputMonth.equalsIgnoreCase("october")   || inputMonth.equals("10")) {
            inputMonthToInt = 10;
        } else if (inputMonth.equalsIgnoreCase("november")  || inputMonth.equals("11")) {
            inputMonthToInt = 11;
        } else if (inputMonth.equalsIgnoreCase("december")  || inputMonth.equals("12")) {
            inputMonthToInt = 12;
        }
        return;
    }

    public static void dayProgression() {       //  Created a method for incrementing the day value from 1 to 7
        if (day < 7) {                          //  then resetting it back to 1 if it's already at day 7 and another day is added
            day += 1;
        } else {
            day -= 6;
        }
        return;
    }

    public static void yearProgression() {      //  Created a method for incrementing the month value from 1 to 12
        datesPassed += 1;
        if (month < 12) {                       //  then resetting it back to 1 if it's already at month 12 and another month is added.
            month += 1;
        } else {
            month -= 11;
            year += 1;
        }
        return;
    }
    
    public static void dateProgression(int maxDate) {
        if (date < maxDate) {
            date += 1;
            datesPassed += 1;
        } else {
            date -= maxDate - 1;
            if (startingDate > maxDate) {
                monthsPassed += 1;
                datesPassed = 0;
            }
            yearProgression();
        }
        dayProgression();
        return;
    }

    public static void calendarProgression() {
        while (date != inputDate && month != inputMonthToInt && year <= inputYear ||
               date == inputDate && month != inputMonthToInt && year <= inputYear ||
               date != inputDate && month == inputMonthToInt && year <= inputYear ||
               date == inputDate && month == inputMonthToInt && year <  inputYear) {
            
                if (month == 2 && year % 4 == 0 && date <= 29 || month == 2 && year % 100 == 0 && year % 400 == 0 && date <= 29) {             // Leap year February
                    dateProgression(29);
                } else if (month == 2 && !(year % 4 == 0 && year % 400 == 0) && date <= 28) {   // Non leap year February
                    dateProgression(28);
                } else if (month <= 7 && month % 2 != 0 && date <= 31 ||                        // Months that goes up to 31 3
                    month >  7 && month % 2 == 0 && date <= 31) {
                    dateProgression(31);
                } else if (month != 2 && month <= 6 && month % 2 == 0 && date <= 30 ||               // Months that goes only up to 30 4
                        month >= 9 && month % 2 != 0 && date <= 30) {
                    dateProgression(30);
                }

                if (date == startingDate) {
                    if (month != startingDate && year == startingYear || year > startingYear) {
                        datesPassed = 0;
                        monthsPassed += 1;
                    }
                }

                if (monthsPassed == 12) {
                    monthsPassed = 0;
                    yearsPassed += 1;
                }
        }
        return;
    }
// ----------------------------------------------------------------------------------------------------------------------------------------------------- \\

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

// ------------------------------------------------------------------- || Inputs || -------------------------------------------------------------------- \\
        System.out.println("| ----------------------------- | Input | ------------------------------ |");

        while (inputYear < year) {
            System.out.print("  Year: ");
            inputYear = sc.nextInt();

            if (inputYear < year) {
                System.out.println("  Invalid year! Your friendship started at " + year);
            }
        }

        while (inputMonthToInt < 1 || inputMonthToInt > 12) {
            System.out.print("  Month: ");
            inputMonth = sc.next();

            convertMonth();

            if (inputMonthToInt < 1 || inputMonthToInt > 12) {
                System.out.println("  Invalid month! Please choose any month between 1 and 12 or January to December");
            }
        }

        while (isDateValid == false) {
            System.out.print("  Date: ");
            inputDate = sc.nextInt();

            if (inputMonthToInt == 2 && inputYear % 4 == 0 || inputMonthToInt == 2 && inputYear % 100 == 0 && inputYear % 400 == 0) {
                if (inputDate < 1 || inputDate > 29) {
                    System.out.println("  Invalid date! Please choose any date between 1 and 29");
                } else {
                    isDateValid = true;
                }

            } else if (inputMonthToInt == 2) {
                if (inputDate < 1 || inputDate > 28) {
                    System.out.println("  Invalid date! Please choose any date between 1 and 28");
                } else {
                    isDateValid = true;
                }

            } else if (inputMonthToInt <= 7 && inputMonthToInt % 2 != 0 || inputMonthToInt > 7 && inputMonthToInt % 2 == 0) {
                if (inputDate < 1 || inputDate > 31) {
                    System.out.println("  Invalid date! Please choose any date between 1 and 31");
                } else {
                    isDateValid = true;
                }

            } else if (inputMonthToInt <= 7 && inputMonthToInt % 2 == 0 || inputMonthToInt > 7 && inputMonthToInt % 2 != 0) {
                if (inputDate < 1 || inputDate > 30) {
                    System.out.println("  Invalid date! Please choose any date between 1 and 30");
                } else {
                    isDateValid = true;
                }
            }
        }
        System.out.println("| ---------------------------------------------------------------------- |\n");

        calendarProgression();
// ----------------------------------------------------------------------------------------------------------------------------------------------------- \\

// ------------------------------------------------------------------- || Printer || ------------------------------------------------------------------- \\
        System.out.println("| ----------------------------- | Result | ----------------------------- |");

        System.out.print("  It's been ");

        if (yearsPassed == 1) {
            System.out.print(yearsPassed + " year ");
        } else if (yearsPassed > 1) {
            System.out.print(yearsPassed + " years ");
        }

        if (yearsPassed == 0) {
            if (monthsPassed == 1) {
                System.out.print(monthsPassed + " month ");
            } else if (monthsPassed > 1) {
                System.out.print(monthsPassed + " months ");
            }
        } else if (yearsPassed > 0 && datesPassed > 0) {
            if (monthsPassed == 1) {
                System.out.print(monthsPassed + " month ");
            } else if (monthsPassed > 1) {
                System.out.print(monthsPassed + " months ");
            }
        } else if (yearsPassed > 0) {
            if (monthsPassed == 1) {
                System.out.print("and " + monthsPassed + " month ");
            }else if (monthsPassed > 1) {
                System.out.print("and " + monthsPassed + " months ");
            }
        }

        if (monthsPassed == 0 && yearsPassed == 0) {
            if (datesPassed == 1) {
                System.out.print(datesPassed + " day ");
            } else if (datesPassed > 1) {
                System.out.print(datesPassed + " days ");
            }
        } else if (monthsPassed > 0 || yearsPassed > 0) {
            if (datesPassed == 1) {
                System.out.print("and " + datesPassed + " day ");
            } else if (datesPassed > 1) {
                System.out.print("and " + datesPassed + " days ");
            }
        }

        System.out.print("since your friendship started - " + dayString[day - 1] + "\n");

        if (yearsPassed > 0 && monthsPassed == 0 && datesPassed == 0) {
            System.out.println("  It's your " + "anniversary! You should greet her and maybe take her on a date ;)");
            System.out.println("| ---------------------------------------------------------------------- |\n");
        } else {
            System.out.println("| ---------------------------------------------------------------------- |\n");
        }
// ----------------------------------------------------------------------------------------------------------------------------------------------------- \\
        sc.close();
    }
}
