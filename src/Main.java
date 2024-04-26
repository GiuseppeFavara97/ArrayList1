import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Aldo", 23);
        Student studente2 = new Student("Giovanni", 18);
        Student studente3 = new Student("Giacomo", 26);
        Student studente4 = new Student("Pio", 20);

       List<Student>  lista = Arrays.asList(studente1, studente2, studente3, studente4);


        for(Student student : lista){
            System.out.println("Studente:  " + student);
        }

    }
}