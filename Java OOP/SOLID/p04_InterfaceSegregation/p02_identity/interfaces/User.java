package SOLID.p04_InterfaceSegregation.p02_identity.interfaces;

public interface User {

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();

    void changePassword(String oldPass, String newPass);

}
