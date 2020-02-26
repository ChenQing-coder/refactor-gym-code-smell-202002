package cc.xpbootcamp.code_smell_kit.$18_middle_man;

/**
 * 坏味道: 中间人
 * AccountAppService只是在调用AccountService所有方法，其表现的像一个中间人。
 */
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
