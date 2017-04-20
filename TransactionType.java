/**
 * Class        : TransactionType 
 * Project 12   : Banking
 * @author      : ar25 (Yves Ouellet)
 * Email        : yves.ouellet@bcbssc.com
 * Creation     : 2017-04-20
 * Last Mod.    : 2017-04-20
 * Due Date     : 2017-04-27
 */

public enum TransactionType {
    WITHDRAW("Withdraw"),
    OPEN("Open"),
    DEPOSIT("Deposit"),
    QUIT("Quit"),
    Balance("Show Balance");
    
    private final String transaction;
    
    private TransactionType(String newTransaction){
        this.transaction = newTransaction;
    }   // Ending bracket of TransactionType constructor
    
    private String TransactionType(){
        return this.transaction;
    }   // Ending bracket of TransactionType getter

}   // Ending bracket of TransactionType enum
