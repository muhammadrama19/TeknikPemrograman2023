public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember (String eName, String eAdress, String ePhone){
        name = eName;
        address = eAdress;
        phone = ePhone;

    }

    public String toString()
    {
        String result = "Name: " + name + "\n";
        result+="Address: " + address + "\n";
        result+="Phone: " + phone;
        return result;
    }

    public abstract double pay ();
}
