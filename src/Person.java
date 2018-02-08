public class Person {
    private String prefix;
    private String suffix;
    private String givenName;
    private String lastName;
    private String birthPlaceCity;
    private String birthPlaceCountry;
    private String christeningPlaceCity;
    private String christeningPlaceCountry;
    private String deathPlaceCity;
    private String deathPlaceCountry;
    private String burialPlaceCity;
    private String burialPlaceCountry;
    private short birthYear;
    private short christeningYear;
    private short deathYear;
    private short burialYear;
    private Person mom, dad;
    private Person[] children, siblings;
    private boolean isAlive;
    private char gender;
    private byte birthDay;
    private String birthMonth;
    private byte christeningDay;
    private byte christeningMonth;
    private byte deathDay;
    private byte deathMonth;
    private byte burialDay;
    private byte burialMonth;

    public Person(String givenName, String lastName, byte birthDay, String birthMonth, short birthYear) {
        this.givenName = givenName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthPlaceCity() {
        return birthPlaceCity;
    }

    public void setBirthPlaceCity(String birthPlaceCity) {
        this.birthPlaceCity = birthPlaceCity;
    }

    public String getBirthPlaceCountry() {
        return birthPlaceCountry;
    }

    public void setBirthPlaceCountry(String birthPlaceCountry) {
        this.birthPlaceCountry = birthPlaceCountry;
    }

    public String getChristeningPlaceCity() {
        return christeningPlaceCity;
    }

    public void setChristeningPlaceCity(String christeningPlaceCity) {
        this.christeningPlaceCity = christeningPlaceCity;
    }

    public String getChristeningPlaceCountry() {
        return christeningPlaceCountry;
    }

    public void setChristeningPlaceCountry(String christeningPlaceCountry) {
        this.christeningPlaceCountry = christeningPlaceCountry;
    }

    public String getDeathPlaceCity() {
        return deathPlaceCity;
    }

    public void setDeathPlaceCity(String deathPlaceCity) {
        this.deathPlaceCity = deathPlaceCity;
    }

    public String getDeathPlaceCountry() {
        return deathPlaceCountry;
    }

    public void setDeathPlaceCountry(String deathPlaceCountry) {
        this.deathPlaceCountry = deathPlaceCountry;
    }

    public String getBurialPlaceCity() {
        return burialPlaceCity;
    }

    public void setBurialPlaceCity(String burialPlaceCity) {
        this.burialPlaceCity = burialPlaceCity;
    }

    public String getBurialPlaceCountry() {
        return burialPlaceCountry;
    }

    public void setBurialPlaceCountry(String burialPlaceCountry) {
        this.burialPlaceCountry = burialPlaceCountry;
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        this.birthYear = birthYear;
    }

    public short getChristeningYear() {
        return christeningYear;
    }

    public void setChristeningYear(short christeningYear) {
        this.christeningYear = christeningYear;
    }

    public short getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(short deathYear) {
        this.deathYear = deathYear;
    }

    public short getBurialYear() {
        return burialYear;
    }

    public void setBurialYear(short burialYear) {
        this.burialYear = burialYear;
    }

    public Person getMom() {
        return mom;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }

    public Person[] getSiblings() {
        return siblings;
    }

    public void setSiblings(Person[] siblings) {
        this.siblings = siblings;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public byte getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(byte birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public byte getChristeningDay() {
        return christeningDay;
    }

    public void setChristeningDay(byte christeningDay) {
        this.christeningDay = christeningDay;
    }

    public byte getChristeningMonth() {
        return christeningMonth;
    }

    public void setChristeningMonth(byte christeningMonth) {
        this.christeningMonth = christeningMonth;
    }

    public byte getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(byte deathDay) {
        this.deathDay = deathDay;
    }

    public byte getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(byte deathMonth) {
        this.deathMonth = deathMonth;
    }

    public byte getBurialDay() {
        return burialDay;
    }

    public void setBurialDay(byte burialDay) {
        this.burialDay = burialDay;
    }

    public byte getBurialMonth() {
        return burialMonth;
    }

    public void setBurialMonth(byte burialMonth) {
        this.burialMonth = burialMonth;
    }
}
