import edu.princeton.cs.algs4.*;

public class Controller {
    public static void main(String[] args) {
        StdOut.println(" .d8888b.                                    888    \n" +
                "d88P  Y88b                                   888    \n" +
                "Y88b.                                        888    \n" +
                " \"Y888b.   88888b.  888d888 .d88b.  888  888 888888 \n" +
                "    \"Y88b. 888 \"88b 888P\"  d88\"\"88b 888  888 888    \n" +
                "      \"888 888  888 888    888  888 888  888 888    \n" +
                "Y88b  d88P 888 d88P 888    Y88..88P Y88b 888 Y88b.  \n" +
                " \"Y8888P\"  88888P\"  888     \"Y88P\"   \"Y88888  \"Y888 \n" +
                "           888                                      \n" +
                "           888                                      \n" +
                "           888                                      \n");
        /**
        StdOut.println("WELCOME TO SPROUT THE GEDCOM CREATOR!");
        StdOut.println("FIRST NAME");
        String firstName = StdIn.readString();
        StdOut.println("MIDDLE NAME");
        String middleName = StdIn.readString();
        StdOut.println("LAST NAME");
        String lastName = StdIn.readString();
        StdOut.println("DAY OF BIRTH");
        byte birthDay = StdIn.readByte();
        StdOut.println("MONTH OF BIRTH");
        byte birthMonth = StdIn.readByte();
        StdOut.println("YEAR OF BIRTH");
        short birthYear = StdIn.readShort();
        Person person = new Person(firstName, middleName, lastName, birthDay, birthMonth, birthYear);
        StdOut.println(person.firstName + " " + person.middleName + " " + person.lastName + " " + person.birthDay + " " + person.birthMonth + " " + person.birthYear);
        **/

        byte birthDay = 1;
        String birthMonth = "JAN";
        short birthYear = 2018;
        Person person = new Person("Given Name", "Last Name", birthDay, birthMonth, birthYear);

        //StdIn.readChar();
        for (int i = 0; i < 18; i++) {
            StdIn.readLine();
        }
        while (StdIn.hasNextLine()) {
            byte num = StdIn.readByte();
            StdOut.println(num);
            StdIn.readChar();
            String type = StdIn.readString();

            switch (num) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                switch (type) {
                    case "NAME":
                        StdIn.readLine();
                        break;
                    case "GIVN":
                        String givenName = StdIn.readLine();
                        person.setGivenName(givenName);
                        break;
                    case "SURN":
                        String lastName = StdIn.readString();
                        person.setLastName(lastName);
                        break;
                    case "SEX":
                        StdIn.readChar();
                        char gender = StdIn.readChar();
                        person.setGender(gender);
                        break;
                    case "BIRT":
                        break;
                    case "DATE":
                        birthDay = StdIn.readByte();
                        person.setBirthDay(birthDay);
                        birthMonth = StdIn.readString();
                        person.setBirthMonth(birthMonth);
                        birthYear = StdIn.readShort();
                        person.setBirthYear(birthYear);
                        StdOut.println(person.getGivenName() + person.getLastName() + person.getGender() + person.getBirthDay() + person.getBirthMonth() + person.getBirthYear());
                        break;
                    case "PLAC":
                        StdIn.readLine();
                    case "BAPM":
                        StdIn.readLine();
                    default:
                        person = new Person("Given Name", "Last Name", birthDay, birthMonth, birthYear);
                        StdOut.println("ups");
                        break;
                }
            }

        }
    }
}