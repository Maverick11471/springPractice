package EffectiveJava.item1;

public class Account {
    private int balance = 0;
    private String accountNum;
    private String accountName;
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    public void setBalance(int balance){
        if(balance < MIN_BALANCE || balance+balance > MAX_BALANCE){
            System.out.println("잔고는 음수 혹은 100만원 이상이 될 수 없습니다.");
        } else {
            this.balance = balance;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }

    public String getAccountNum(){
        return accountNum;
    }

    public void setAccountName(String accountNum){
        this.accountName = accountNum;
    }

    public String getAccountName(){
        return accountName;
    }

}
