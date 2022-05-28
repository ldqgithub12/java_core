package models;

import lombok.*;

import java.util.Date;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionHistory {
    private int id;
    private int userId;
    private String content;
    private Date date;
    private String receiveAccount;
    private long receiveMoney;
    public void printTransaction(){
        System.out.println(id+" - "+date+" - "+content+" - "+receiveAccount+" - "+receiveMoney);
    }
}
