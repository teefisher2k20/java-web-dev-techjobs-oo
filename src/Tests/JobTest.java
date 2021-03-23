package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;

import javax.lang.model.element.Name;
import javax.xml.namespace.QName;
import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void createJobObject() {

        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() != job2.getId());
        assertTrue(job2.getId() - job1.getId() >= 1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobFullConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobFullConstructor instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void blankLineBeforeAfterJob() {
        String text = job1.toString();
        assertTrue(text.contains("\n"));
    }

}


