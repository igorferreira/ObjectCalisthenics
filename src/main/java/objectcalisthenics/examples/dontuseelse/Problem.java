package objectcalisthenics.examples.dontuseelse;

public class Problem {
    
    public String Login(String username, String password)
    {
        String view = "";
        
        if (!isValid(username, password))
        {
                System.err.print("error - Bad credentials");
                view = "Login";
        }
        else
        {
                view = "Home";
        }
        return view;
    }

    private boolean isValid(String username, String password) {
        return false;
    }

}
