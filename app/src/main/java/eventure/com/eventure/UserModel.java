package eventure.com.eventure;

/**
 * Created by ivan on 5/2/2016.
 */
public class UserModel {
    public String username;
    public String password;

    public UserModel(String username, String password){
        this.username=username;
        this.password=password;
    }

    private static UserModel[] data;
    public static UserModel[] getUsers(){
        if(data==null)
            data = new UserModel[]{
                    new UserModel("van","van"),
                    new UserModel("sar","sar"),
                    new UserModel("wan","wan"),
                    new UserModel("lim","lim")
            };

        return data;
    }

    public static boolean checkUser(String username, String password)
    {
        for(UserModel current : getUsers()) //ForEach
            if(current.username.equals(username) && current.password.equals(password))
                return  true;

        return false;
    }


}
