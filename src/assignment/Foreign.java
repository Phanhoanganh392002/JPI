package assignment;

public class Foreign extends Domestic{
    public String nationality;
    public Foreign(){}
    public Foreign(int idCustomers, String name, String invoiceDate, int amount,String nationality){
        super(idCustomers, name, invoiceDate, amount);
        this.nationality=nationality;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    @Override
    public double TienDien(){return getAmount()*2000;}
}
