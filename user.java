package 封装;

public class user {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int year;

    //空参
    public user() {

    }

    //带全部参数的构造
    public user(String username, String password, String email, String gender, int year) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.year = year;

    }

    //get()和set()方法；10

    //alt + insert + fn
    //alt + insert

    public void getUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }


    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * 设置
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

}
