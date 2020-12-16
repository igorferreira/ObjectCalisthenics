package objectcalisthenics.examples.dontuseelse;

public class Solution {
    
    public String Login(String username, String password)
    {
        
        if (!isValid(username, password))
        {
            System.err.print("error - Bad credentials");
            return "Login";
        }

        return  "Home";
    }

    private boolean isValid(String username, String password) {
        return false;
    }

}
