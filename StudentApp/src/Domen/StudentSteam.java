package Domen;

import java.util.ArrayList;
import java.util.List;

public class StudentSteam {

    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentSteam(int streamNumber, List<StudentGroup> groups) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {

        this.groups.add(group);

    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

}
