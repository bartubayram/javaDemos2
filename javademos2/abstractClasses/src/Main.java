public class Main {
    public static void main(String[] args) {
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.gameOver();


        GameCalculator gameCalculator=new WomenGameCalculator();


    }
}