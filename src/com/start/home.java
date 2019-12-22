package com.start;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class home {
public static void main(String args[]){

    Ui.start_view();
}
static String get_date(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
}
static String get_time(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
}
}
