package EffectiveJava.item1;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Account[] accounts = new Account[100];

        Scanner scanner = new Scanner(System.in);

        boolean process = true;
        while(process){
            System.out.println("------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------");

            System.out.print("선택>");
            String checkNum = scanner.nextLine();
            System.out.println("------------------");

            switch (checkNum){
                case "1" :
                    System.out.println("계좌생성");
                    System.out.println("------------------");
                    for (int i = 0; i < accounts.length; i++){
                        if(accounts[i] == null){
                            accounts[i] = new Account();
                            System.out.print("계좌번호: ");
                            accounts[i].setAccountNum(scanner.nextLine());
                            System.out.print("계좌주: ");
                            accounts[i].setAccountName(scanner.nextLine());
                            System.out.print("초기입금액: ");
                            accounts[i].setBalance(Integer.parseInt(scanner.nextLine()));
                            System.out.println("결과: 계좌가 성립되었습니다.");
                            break;
                        }
                    }
                    break;
                case "2" :
                    System.out.println("계좌목록");
                    System.out.println("------------------");
                    for(int i = 0; i < accounts.length; i++){
                        if(accounts[i] == null){
                            break;
                        } else {
                            System.out.print(accounts[i].getAccountNum() + "  ");
                            System.out.print(accounts[i].getAccountName() + "  ");
                            System.out.println(accounts[i].getBalance());
                        }
                    }
                    break;
                case "3" :
                    System.out.println("예금");
                    System.out.println("------------------");
                    for(int i = 0 ; i < accounts.length ; i++){
                        System.out.print("계좌번호: ");
                        String accountNum = scanner.nextLine();
                        if(accounts[i] != null) {
                            if(!accounts[i].getAccountNum().equals(accountNum)){
                                System.out.println("입력하신 계좌는 존재하지 않습니다. 다시 입력하세요.");
                                i--;
                                continue;
                            } else {
                                System.out.print("예금액: ");
                                int depositAmount = Integer.parseInt(scanner.nextLine());
                                if(depositAmount < 0){
                                    System.out.println("음수를 입력할 수 없습니다.");
                                } else {
                                    accounts[i].setBalance(accounts[i].getBalance() + depositAmount);
                                }
                                break;
                            }
                        }
                        else if(accounts[i] == null){
                            System.out.println("등록된 계좌가 없습니다.");
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("출금");
                    System.out.println("------------------");
                    for(int i = 0; i < accounts.length;i++){
                        System.out.print("계좌번호: ");
                        String accountNum = scanner.nextLine();
                        if(accounts[i] != null) {
                            if(!accounts[i].getAccountNum().equals(accountNum)){
                                System.out.println("입력하신 계좌는 존재하지 않습니다. 다시 입력하세요.");
                                i--;
                                continue;
                            } else {
                                System.out.print("출금액: ");
                                int withdrawalAmount = Integer.parseInt(scanner.nextLine());
                                if(withdrawalAmount < 0){
                                    System.out.println("음수를 입력할 수 없습니다.");
                                } else {
                                    if(accounts[i].getBalance() - withdrawalAmount > 0){
                                        accounts[i].setBalance(accounts[i].getBalance() - withdrawalAmount);
                                        System.out.println("결과: 출금이 성공되었습니다.");
                                    } else{
                                        System.out.println("잔액이 부족합니다.");
                                    }
                                }
                                break;
                            }
                        }
                        else if(accounts[i] == null){
                            System.out.println("등록된 계좌가 없습니다.");
                            break;
                        }
                    }
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    process = false;
            }
        }
    }
}
