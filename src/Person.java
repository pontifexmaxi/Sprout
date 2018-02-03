public class Person {
    private String prefix, suffix,
            firstName, middleName, lastName,
            birthPlaceCity, birthPlaceCountry, christeningPlaceCity, christeningPlaceCountry,
            deathPlaceCity, deathPlaceCountry, burialPlaceCity, burialPlaceCountry;
    private short birthDay, birthMonth, birthYear,
            christeningDay, christeningMonth, christeningYear,
            deathDay, deathMonth, deathYear,
            burialDay, burialMonth, burialYear;
    private Person mom, dad;
    private Person[] children, siblings;
    private boolean isAlive;
    private byte gender;
}
