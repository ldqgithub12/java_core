package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.MinMoneyException;
import exception.NotFoundException;
import exception.WrongAccountException;
import models.TransactionHistory;
import models.User;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class UserService {
    List<User> userList = new ArrayList<>();
    List<TransactionHistory> transactionHistories = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public UserService() {
        userList = getObjectFromJsonFile("user.json");
    }

    private List<User> getObjectFromJsonFile(String filename){
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(filename));
            List<User> users = Arrays.asList(gson.fromJson(reader,User[].class));
            reader.close();
            return users;
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
    private void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();
            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<User> getUserList(){
        return userList;
    }
    public User login(){
        User user = new User();
        System.out.print("Enter your phone number: ");
        String phoneNumber =sc.nextLine();
        System.out.print("Enter your password: ");
        String password =sc.nextLine();
        user = userList
                .stream()
                .filter(user1 -> user1.getPhone().equals(phoneNumber) && user1.getPassword().equals(password))
                .findAny()
                .orElse(null);
        if (user !=null){
            return user;
        }
        else {
            throw new WrongAccountException("Phone number or password is not correct");
        }
    }
    public void viewBalance(User user){
        System.out.println("Your money is "+user.getBalance());
    }
    public void viewTransactionHistory(User user){
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("transaction.json"));
            transactionHistories = Arrays.asList(gson.fromJson(reader,TransactionHistory[].class));
            transactionHistories = transactionHistories
                    .stream()
                    .filter(transaction -> transaction.getUserId() == user.getId())
                    .collect(Collectors.toList());
            System.out.println("Your Transaction History");
            transactionHistories
                    .stream()
                    .forEach(transactionHistory -> transactionHistory.printTransaction());
            if (transactionHistories.isEmpty()){
                throw new NotFoundException("You have no transaction");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public TransactionHistory transferMoney(User user){
        try {
            List<TransactionHistory> newListTransaction = new ArrayList<>();
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("transaction.json"));
            transactionHistories = Arrays.asList(gson.fromJson(reader,TransactionHistory[].class));
            Random rd = new Random();
            System.out.print("Enter the receive account: ");
            String receiveAccount = sc.nextLine();
            System.out.print("Enter your sending money: ");
            long sendingMoney = Long.parseLong(sc.nextLine());
            User receiveUser = userList
                    .stream()
                    .filter(user1 -> user1.getAccount().equals(receiveAccount))
                    .findAny()
                    .orElse(null);
            if(receiveUser == null){
                throw new NotFoundException("Does not exist this user ");
            }
            if (user.getBalance() <=50000){
                throw new MinMoneyException("Your balance must be more than 50.000 VND");
            }
            if (user.getBalance() < sendingMoney){
                throw new MinMoneyException("Your balance must be more than the sending money");
            }
            if (user.getBalance()-sendingMoney < 50000){
                throw new MinMoneyException("The max money you can send : "+(user.getBalance()-50000)+" because the min of balance is 50.000");
            }
            System.out.print("Enter the message: ");
            String content = sc.nextLine();
            SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date(System.currentTimeMillis());
            TransactionHistory newTransaction = new TransactionHistory(rd.nextInt(100)+3,user.getId(),content,date,receiveAccount,sendingMoney );
            newListTransaction.add(newTransaction);
            newListTransaction.addAll(transactionHistories);
            user.setBalance(user.getBalance()-sendingMoney);
            receiveUser.setBalance(receiveUser.getBalance()+sendingMoney);
            for (User u:userList){
                if (u.getId() == user.getId()){
                    u = user;
                }
            }
            for (User u:userList){
                if (u.getId() ==receiveUser.getId()){
                    u = receiveUser;
                }
            }
            convertObjectToJsonFile("user.json",userList);
            convertObjectToJsonFile("transaction.json",newListTransaction);
            return newTransaction;
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
