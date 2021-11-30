package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<Integer> getFamilyMemberAge(String memberName) {
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember familyMember : familyMembers) {
            if (familyMember.getName().contains(memberName)) {
                ages.add(familyMember.getAge());
            }
        }
        return ages;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }
}