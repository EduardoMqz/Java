package OOP_II;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film%n", title, instanceType);
    }

    

}
