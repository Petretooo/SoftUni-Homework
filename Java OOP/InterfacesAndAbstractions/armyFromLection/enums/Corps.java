package InterfacesAndAbstractions.armyFromLection.army.enums;

public enum Corps {
    AIRFORCE,
    MARINES;

    @Override
    public  String toString(){
        String result = super.toString();

        result = result.charAt(0) + result.substring(1).toLowerCase();

        return result;
    }

}
