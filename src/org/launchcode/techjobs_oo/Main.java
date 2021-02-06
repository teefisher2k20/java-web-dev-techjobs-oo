package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    private static int id;

    public static void main(String[] args) {

        Job job1 = new Job(id,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job(id,"Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job(id,"Ice cream tester", new Employer("Data not available"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}
