package SOLID.p04_InterfaceSegregation.p02_identity;

import SOLID.p04_InterfaceSegregation.p02_identity.interfaces.User;

public class UserImpl implements User {


    @Override
    public int getMinRequiredPasswordLength() {
        return 0;
    }

    @Override
    public int getMaxRequiredPasswordLength() {
        return 0;
    }

    @Override
    public void changePassword(String oldPass, String newPass) {

    }
}
