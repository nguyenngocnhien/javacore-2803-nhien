package OOP.login;

public class User {
    private int id;
    private String userName;
    private String passWord;
    private String displayName;
    private String email;
    int t=0;
    public User() {
    }

    public User(int id, String userName, String passWord, String displayName, String email) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.displayName = displayName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
//        do {
//            if (email.equals("@")){
//                this.email=email;
//                t=1;
//            }
//            else {
//                System.out.println("Sai định dạng Email");
//            }
//        }while (t!=1);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
