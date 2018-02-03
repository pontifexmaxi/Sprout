import java.util.Date;

public class Person {
    private String prefix, suffix,
            firstName, middleName, lastName,
            birthPlaceCity, birthPlaceCountry, christeningPlaceCity, christeningPlaceCountry,
            deathPlaceCity, deathPlaceCountry, burialPlaceCity, burialPlaceCountry;
    private Date birthDate, christeningDate, deathDate, burialDate;
    private Person mom, dad;
    private Person[] children, siblings;
    private boolean isAlive;

    public Person(String prefix, String suffix, String firstName, String middleName, String lastName, String birthPlaceCity, String birthPlaceCountry, String christeningPlaceCity, String christeningPlaceCountry, String deathPlaceCity, String deathPlaceCountry, String burialPlaceCity, String burialPlaceCountry, Date birthDate, Date christeningDate, Date deathDate, Date burialDate, Person mom, Person dad, Person[] children, Person[] siblings, boolean isAlive) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthPlaceCity = birthPlaceCity;
        this.birthPlaceCountry = birthPlaceCountry;
        this.christeningPlaceCity = christeningPlaceCity;
        this.christeningPlaceCountry = christeningPlaceCountry;
        this.deathPlaceCity = deathPlaceCity;
        this.deathPlaceCountry = deathPlaceCountry;
        this.burialPlaceCity = burialPlaceCity;
        this.burialPlaceCountry = burialPlaceCountry;
        this.birthDate = birthDate;
        this.christeningDate = christeningDate;
        this.deathDate = deathDate;
        this.burialDate = burialDate;
        this.mom = mom;
        this.dad = dad;
        this.children = children;
        this.siblings = siblings;
        this.isAlive = isAlive;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getChristeningDate() {
        return christeningDate;
    }

    public void setChristeningDate(Date christeningDate) {
        this.christeningDate = christeningDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Date getBurialDate() {
        return burialDate;
    }

    public void setBurialDate(Date burialDate) {
        this.burialDate = burialDate;
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
}
