package ex_2026.ex_2026_1.ex_02242026;

public class BankAccountt {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName, boolean admin) {
        if(admin==true){
            this.userName = userName;
        }else{
            System.out.println("You are not Admin");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
