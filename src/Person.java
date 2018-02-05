public class Person {
    private String prefix;
    private String suffix;
    String firstName;
    String middleName;
    String lastName;
    private String birthPlaceCity;
    private String birthPlaceCountry;
    private String christeningPlaceCity;
    private String christeningPlaceCountry;
    private String deathPlaceCity;
    private String deathPlaceCountry;
    private String burialPlaceCity;
    private String burialPlaceCountry;
    short birthYear;
    private short christeningYear;
    private short deathYear;
    private short burialYear;
    private Person mom, dad;
    private Person[] children, siblings;
    private boolean isAlive;
    private byte gender;
    byte birthDay;
    byte birthMonth;
    private byte christeningDay;
    private byte christeningMonth;
    private byte deathDay;
    private byte deathMonth;
    private byte burialDay;
    private byte burialMonth;

    public Person(String firstName, String middleName, String lastName, byte birthDay, byte birthMonth, short birthYear) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }
}
