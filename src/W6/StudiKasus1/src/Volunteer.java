public class Volunteer extends StaffMember{
    public Volunteer (String eName, String eAddress, String ePhome)
    {
        super(eName, eAddress, ePhome);
    } 
    @Override 
    public double pay()
    {
        return 0.0;
    }
    
}
