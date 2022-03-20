package chapter3;

public class Clock {

    public  int hour;
    public int minute;
    public int second;

        public Clock(int hour, int minute, int second ){
            if(hour > 23)
                hour = 0;
            this.hour = hour;
            if (minute > 59)
                this.minute = 00;
            if (second > 59)
                second = 0;
            this.second = second;
        }

    public void setHour(int hour){
            if(hour > 23)
                this.hour = 00;
    }
    public int getHour(){
            return hour;
    }

    public void setMinute(int minute) {
        if (minute > 59)
            minute = 00;
            this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second > 59)
            second = 0;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public String displayTime(){
        String display = getHour() + ":" +getMinute()+ ":" +getSecond();
         return display;
    }
    }