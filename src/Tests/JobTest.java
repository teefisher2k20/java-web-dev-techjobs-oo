package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.lang.model.element.Name;
import javax.xml.namespace.QName;
import static org.junit.Assert.*;

public class JobTest extends JobField   {

    public JobTest(String value) {
        super(value);
//    private int id;
//    private int nextId = 1;
//    private String name;
//    private Employer employer;
//    private Location location;
//    private PositionType positionType;
//    private CoreCompetency coreCompetency;
//
//
//    public JobTest() {
//        id = nextId;
//        nextId++;
//    }
//
//    public JobTest(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
//        this();
//        this.id = id;
//        this.name = name;
//        this.employer = employer;
//        this.location = location;
//        this.positionType = positionType;
//        this.coreCompetency = coreCompetency;
//    }
//
//    @Before
//    public void testSettingJobId() {
//        id = nextId;
//        nextId++;
//        Job job1 = new Job(id, "Product tester", employer, location, positionType, coreCompetency);
//        Job job2 = new Job(id, "Full-Stack Developer", employer, location, positionType, coreCompetency);
//    }
//
//    @Test
//    public void testJobConstructorSetsAllFields() {
//        Job job = new Job(id, "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("value", id, .001);
//
//    }
//
//    @Test
//    public void testJobsForEquality() {
//        Job job = new Job(id, "Full-Stack Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job1 = new Job(id, "Full-Stack Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertFalse(job != job1);
//    }
//
//    @Test
////When passed a Job object, it should return a string that contains a blank line before and after the job information
//    public void hasStringThatContainsBlankLineBeforeAndAfterJobInfo() {
//        assertTrue(Job.hasStringThatContainsBlankLineBeforeAndAfterJobInfo(" "));
//    }
//
//    @Test
////The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line
//    public void containsLabelForEachField() {
//        assertTrue(Job.containsLabelForEachField(",", "\n"));
//    }
//
//    @Test//If a field is empty, the method should add, “Data not available” after the label
//    public void ifFieldIsEmpty() {
//        assertTrue(Job.ifFieldIsEmpty(" ", true));
//    }
//
//    @Test//(Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
//    public void ifJobContainsData() {
//        assertTrue(Job.ifJobContainsDataForIdField(id, true));
//    }
    }
}
