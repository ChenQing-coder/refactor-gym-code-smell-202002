package cc.xpbootcamp.code_smell_kit.$19_insider_trading;


import java.util.List;

public class AccountRegister {
    private RegisterReport registerReport;
    private SmsClient smsClient;
    private List<Account> accounts;

    public RegisterReport getRegisterReport() {
        return registerReport;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    private void sendSms() {
        smsClient.send(registerReport.generateReport());

    }
}
