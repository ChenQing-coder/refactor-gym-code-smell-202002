package cc.xpbootcamp.code_smell_kit.$19_insider_trading;


import java.util.List;

/**
 * 坏味道：内幕交易
 * AccountRegister发送短信需要调用RegisterReport的generateReport方法，而RegisterReport的generateReport有需要使用
 * AccountRegister的getAccounts方法，双方的方法互相调用耦合在一起。
 */
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
