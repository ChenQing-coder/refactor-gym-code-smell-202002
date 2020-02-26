package cc.xpbootcamp.code_smell_kit.$18_middle_man;

public class AccountAppService {
    private AccountService accountService;

    public AccountAppService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String getAccountId() {
        return accountService.getAccountId();
    }

    public String getAccountNumber() {
        return accountService.getAccountNumber();
    }

    public String getCertificateNumber() {
        return accountService.getCertificateNumber();
    }
}
