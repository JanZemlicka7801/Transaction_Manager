package TransactionManager;
import java.time.LocalDateTime;
public class Transaction {
    private String senderAccount;
    private String receiverAccount;
    private double amount;
    private Currency currency;
    private LocalDateTime timestamp;

    public Transaction(String senderAccount, String receiverAccount, double amount, Currency currency, LocalDateTime timestamp) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.currency = currency;
        this.timestamp = timestamp;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "senderAccount='" + senderAccount + '\'' +
                ", receiverAccount='" + receiverAccount + '\'' +
                ", amount=" + amount +
                ", currency=" + currency +
                ", timestamp=" + timestamp +
                '}';
    }
}
