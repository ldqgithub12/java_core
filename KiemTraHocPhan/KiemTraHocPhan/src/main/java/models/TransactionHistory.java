package models;

import lombok.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionHistory {
    private static final String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss";
    private int id;
    private int userId;
    private String content;
    private Date date;
    private String receiveAccount;
    private long receiveMoney;
    public void printTransaction(){
        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(id+" - "+formatter.format(date)+" - "+content+" - "+receiveAccount+" - "+receiveMoney);
    }
}
