package cc.xpbootcamp.code_smell_kit.$18_middle_man;

public class AccountService {
    private String accountId;
    private String accountNumber;
    private String certificateNumber;

    public AccountService(String accountId, String accountNumber, String certificateNumber) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.certificateNumber = certificateNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }
}
