/**
 * Class        : Customer 
 * Project 12   : Banking
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-20
 * Last Mod.    : 2017-04-20
 * Due Date     : 2017-04-27
 */


public class Customer{
    private String userId;
    private String password;
    
    public Customer(){
        super();
        this.userId = "USERID";
        this.password = "********";
    }   // Ending bracket of constructor

    public Customer(String newUserId, String newPassword) {
        this.userId = newUserId;
        this.password = newPassword;
    }      // Ending bracket of constructor
        
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }      // Ending bracket of getuserId

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }      // Ending bracket of setUserId

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }   // Ending bracket of getPassword

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }   // Ending bracket of setPassword
    
    
}   // Ending bracket of class Customer
