package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.xml.namespace.QName;

import static org.graalvm.compiler.nodeinfo.Verbosity.Id;
import static org.junit.Assert.*;

public class JobTest {
    private Integer id;
    private static int nextId = 1;
    private String value;
    private Object employer;
    private Object location;
    private Object positionType;
    private Object coreCompetency;


    public JobTest () {
        id = nextId;
        nextId++;
    }
    public JobTest(Integer id, String value, Object Employer, Object Location, Object PositionType, Object CoreCompetency) {
        this();
        this.id = id;
        this.value = value;
        this.employer = Employer;
        this.location = Location;
        this.positionType = PositionType;
        this.coreCompetency = CoreCompetency;
    }
    @Before
    public void testSettingJobId() {
        Job job1 = new Job(new Integer("id"),"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job(new Integer("id"),"Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"),new CoreCompetency("JavaScript"));
        assertFalse("job1" != "job2");
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job(new Integer("id"), "name", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("name", job3.getName(), .001);

    }
    @Test
    public void testJobsForEquality() {
        Job job5 = new Job(new Integer("id"), "name", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job(new Integer("id"), "name", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.equals(job5));
    }
}
