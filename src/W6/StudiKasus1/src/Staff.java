public class Staff {
    StaffMember[] stafflist;

    public Staff()
    {
        stafflist=new StaffMember[9];
        stafflist[0]= new Executive("Sam", "123 Main Inline", "555-0469", "123-45-6789", 2423.07);
        stafflist [1]= new Employee("Carla", "456 Off Line", "555-0101 ","987-65-43211",1246.15);
        stafflist[2] = new Employee("Woody", "789 Off Rocker", "555-000", "010-20-3040", 1169.23);
        stafflist[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        stafflist[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        stafflist[5] = new Volunteer("Cliff", "321 Duds Lane", "555-782");
        stafflist[6] = new Commission("Mikasa", "15th Avenue Stret", "081-000", "000-111-9000", 6.25, 0.2 );
        stafflist[7] = new Commission("Armin","Rose Avenue","090-90","000-000-90",9.75,0.15);
        ((Executive)stafflist[0]).awardBonus(500.00); //!harus di cast karena kita butuh method yang hanya ada di exc
        ((Hourly)stafflist[3]).addHours(40); 
        ((Commission)stafflist[6]).addHours(35);
        ((Commission)stafflist[6]).addSales(400);
        ((Commission)stafflist[7]).addHours(35);
        ((Commission)stafflist[7]).addSales(950);
    }
    public void payday(){
        double amount;

        for (int i = 0; i < stafflist.length; i++) {
            System.out.println(stafflist[i]); //panggil to string dari setiap obj
            //!polymorphic refrence

            amount = stafflist[i].pay(); //panggil pay yang sudah di overide di masing masing class\ //!pay sudah ada di semua class sehingga tidak perlu casting
            //!polymorphic refrence
            //!khusus pay() dari setiap obj

            if (amount==0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }
            System.out.println("------------------");
            
        }
    }     
}