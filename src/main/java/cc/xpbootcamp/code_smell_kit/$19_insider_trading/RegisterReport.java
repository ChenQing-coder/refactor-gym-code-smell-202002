package cc.xpbootcamp.code_smell_kit.$19_insider_trading;

import java.util.stream.Collectors;

public class RegisterReport {
    private AccountRegister register;

    public String generateReport() {
        return register.getAccounts().stream().map(Account::getInfo).collect(Collectors.joining());
    }
}
