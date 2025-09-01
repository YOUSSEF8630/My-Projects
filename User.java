abstract class User{

    protected String userid;
    protected String username;
    protected String password;
    protected String name;
    protected String email;
    protected String contactinfo;


    public User(String userid, String username,String password, String name,String email,String contactinfo)
    {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.contactinfo = contactinfo;

    }

    public boolean login(String enteredusername,String enteredpassword)
    {
        return this.username.equals( enteredusername)&&this.password.equals( enteredpassword);
    }

    public void logout()
    {
        System.out.println("User"+username+"loggedout");
    }

    public void updateprofile(String name,String email, String contactinfo)
    {
        this.name = name;
        this.email = email;
        this.contactinfo = contactinfo;

    }
}
