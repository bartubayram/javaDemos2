public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new OracleDatabseManager();
        customerManager.getCustomers();
        customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager=new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}