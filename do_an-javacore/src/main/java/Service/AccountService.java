package Service;

import Model.Account;

import java.util.ArrayList;

public class AccountService {

    public ArrayList<Account> getAllAccount(){
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("0355540066", "Khoa1998"));


        return accounts;
    }

    public Account checkLogin(ArrayList<Account> accounts , String mobile, String password){
        for (Account a:accounts){
            if(a.getMobile().equals(mobile)){
                if(a.getPassword().equals(password)){
                    return a;
                }
            }
        }
        return null;
    }
}
