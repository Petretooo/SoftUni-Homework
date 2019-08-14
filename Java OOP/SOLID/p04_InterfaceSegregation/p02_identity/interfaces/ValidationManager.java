package SOLID.p04_InterfaceSegregation.p02_identity.interfaces;

public interface ValidationManager {

    String getEmail();

    String getPasswordHash();

    void changePassword(String oldPass, String newPass);

}
