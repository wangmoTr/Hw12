import java.util.*;
public class Main {
    public static void main(String[] args) {
        //cohort 1
        Set<String> cohort1 = new HashSet<String>();
        cohort1.add("United States");
        cohort1.add("United States");
        cohort1.add("Ukraine");
        cohort1.add("Mexico");
        //cohort 2
        Set<String> cohort2 = new HashSet<String>();
        cohort2.add("United States");
        cohort2.add("Canada");
        cohort2.add("United States");
        cohort2.add("Mexico");
        // print out all unique countries
        System.out.println(cohort1);
        System.out.println(cohort2);

        Set<String> cohort1A = new TreeSet<String>(cohort1);

        //cohort 2
        Set<String> cohort2A = new TreeSet<String>(cohort2);

        System.out.println(cohort1A);
        System.out.println(cohort2A);

        // most common coutrnies for both cohort
        Set<String> bigcohort = new HashSet<String>(cohort1);
        bigcohort.addAll(cohort2);
        System.out.println(bigcohort);

    }
}
