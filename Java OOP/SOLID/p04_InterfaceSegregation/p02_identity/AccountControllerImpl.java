package SOLID.p04_InterfaceSegregation.p02_identity;

import SOLID.p04_InterfaceSegregation.p02_identity.interfaces.AccountController;
import SOLID.p04_InterfaceSegregation.p02_identity.interfaces.AccountManager;

public class AccountControllerImpl implements AccountController {

    private AccountManager accountManager;

    public AccountControllerImpl(AccountManager accountManager) {
        this.accountManager = accountManager;
    }
    public void changePassword(String oldPass,String newPass){

       // this.manager.changePassword(oldPass,newPass);
    }

    @Override
    public boolean getRequireUniqueEmail() {
        return false;
    }

}
