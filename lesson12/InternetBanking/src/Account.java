public class User {
    private String sdt;
    private String password;

    public User(String sdt, String password) {
        this.sdt = sdt;
        this.password = password;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User:   " +
                "sdt='" + sdt + '\'' +
                ", password='" + password + '\'';
    }
}
