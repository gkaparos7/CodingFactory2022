package gr.aueb.cf.ch7;

public class ConcatAtApp {

    public static void main(String[] args) {
        String title = "Mr.";
        String firstname = "Ioannis ";
        String lastname = "Kaparos";
        String fullname;
        String titledFullName;

        fullname = firstname + " " + lastname;
        titledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullname);
        System.out.println(titledFullName);

    }
}
