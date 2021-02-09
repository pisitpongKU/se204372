import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Pisitpong Phochai"); 
	groupMembers.add("Sumita Tandanai");//PUT YOUR NAME HERE
	groupMembers.add("Tanaphat Anupunyothin");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
