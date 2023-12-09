public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager=customerManager1;
        customerManager.Update();
        customerManager.Add();
        customerManager.Remove();

            int s1 = 10;
            int s2=20;
            s2=s1;
            s1=30;
        System.out.println(s2);
        System.out.println(s1);

        int []sayilar1= new int[]{1,2,3};
        int [] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);


    }
}
