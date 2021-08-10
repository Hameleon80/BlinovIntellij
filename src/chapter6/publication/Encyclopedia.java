package chapter6.publication;

/**
 * Describe entity encyclopedia.
 *
 * Ahtirskij Yuriy 10.08.2021
 */
public class Encyclopedia extends Book{
    //=================== Constructors ===================

    public Encyclopedia() {
        super();
    }

    public Encyclopedia(String title, String author, String summary, int circulation) {
        super(title, author, summary, circulation);
    }

    /**
     * Print title, author and summary.
     */
    @Override
    public void showInfo() {
        System.out.println(getTitle() + " - " + getAuthor() + "\n" + getSummary());
    }
}
