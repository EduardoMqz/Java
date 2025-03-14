package OOP_II;

public class Adventure extends Movie{

    public Adventure (String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),"Pleasant scene", "Scary Music", "Something bad happens");
    }

    

}
