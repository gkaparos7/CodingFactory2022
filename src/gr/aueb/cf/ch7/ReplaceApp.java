package gr.aueb.cf.ch7;

public class ReplaceApp {

    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitled;

        dashedTitled = title.replace(" ", "-");
        System.out.println(dashedTitled);
    }
}
