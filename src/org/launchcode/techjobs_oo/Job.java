package org.launchcode.techjobs_oo;

public class Job extends JobField {


    public Job(int id, String value, Employer launchCode, Location location, PositionType positionType, CoreCompetency javaScript) {
        super(value);
//    private int id;
//    private static int nextId = 1;
//
//    private String name;
//    private Employer employer;
//    private Location location;
//    private PositionType positionType;
//    private CoreCompetency coreCompetency;
//
//    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
//    //  other five fields. The second constructor should also call the first in order to initialize
//    //  the 'id' field.
//
//
//
//    public Job() {
//        id = nextId;
//        nextId++;
//    }
//
//    public Job (int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
//        this();
//        this.id = id;
//        this.name = name;
//        this.employer = employer;
//        this.location = location;
//        this.positionType = positionType;
//        this.coreCompetency = coreCompetency;
//
//    }
//
//    public static boolean hasStringThatContainsBlankLineBeforeAndAfterJobInfo(String s) { return true; }
//
//    public static boolean containsLabelForEachField(String s, String s1) { return true; }
//
//    public static boolean ifFieldIsEmpty(String s, boolean b) { return true; }
//
//    public static boolean ifJobContainsDataForIdField(int id, boolean b) {return true; }
//
//
//    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//    //  match.
//
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Job job = (Job) o;
//        return id == job.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//
//    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//    //  and id.
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public PositionType getPositionType() {
//        return positionType;
//    }
//
//    public void setPositionType(PositionType positionType) {
//        this.positionType = positionType;
//    }
//
//    public CoreCompetency getCoreCompetency() {
//        return coreCompetency;
//    }
//
//    public void setCoreCompetency(CoreCompetency coreCompetency) {
//        this.coreCompetency = coreCompetency;
//    }


    }
}
