package assignment;

public class Domestic {
    private int IdCustomers;
    public String name;
    public String InvoiceDate;
    public String CustomersOjt;//(sinh hoạt, kinh doanh, sản xuất
    public int amount;
    public int getIdCustomers() {
        return IdCustomers;
    }
    public void setIdCustomers(int idCustomers) {
        IdCustomers = idCustomers;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInvoiceDate() {
        return InvoiceDate;
    }
    public void setInvoiceDate(String invoiceDate) {
        InvoiceDate = invoiceDate;
    }
    public String getCustomersOjt() {
        return CustomersOjt;
    }
    public void setCustomersOjt(String customersOjt) {
        CustomersOjt = customersOjt;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Domestic(){}
    public Domestic(int idCustomers, String name, String invoiceDate, String customersOjt, int amount) {
        IdCustomers = idCustomers;
        this.name = name;
        InvoiceDate = invoiceDate;
        CustomersOjt = customersOjt;
        this.amount = amount;
    }

    public Domestic(int idCustomers, String name, String invoiceDate, int amount) {
        IdCustomers = idCustomers;
        this.name = name;
        InvoiceDate = invoiceDate;
        this.amount = amount;
    }

    public double TienDien(){
        double tiendien=0.0;
        String sh="sinhhoat",kd="kinhdoanh",sx="sanxuat";
        int m50=1000,m100=1200,m200=1500,mm=2000;
        if(CustomersOjt.toLowerCase().replaceAll("\\s+","").equals(sh)){
            tiendien = amount <= 50 ? amount * m50 : (50 * m50) + (amount - 50) * (amount <= 100 ? m100 : amount <= 200 ? m200 : mm);
        }else if(CustomersOjt.toLowerCase().replaceAll("\\s+","").equals(kd)){
            tiendien=amount<=100?amount*m100:(100*m100)+(amount-100)*(amount<=200?m200:mm);
        }else if(CustomersOjt.toLowerCase().replaceAll("\\s+","").equals(sx)){
            tiendien=amount<=200?amount*m200:(200*m200)+(amount-200)*mm;
        }else{
            tiendien=amount*mm;
        }
        return tiendien;
    }
}
