package Programs;

public class LeapYear {

    public static void main(String[] args) {


        int[] years ={1900,2000,2004,2008,2010,2020,2024,2028,2021};

        for(int a=0;a<years.length;a++){
            if(years[a]%4==0){
                System.out.println("Leap year is "+years[a]);
            }else {
                System.out.println("Non Leap year is  "+years[a]);
            }
        }


    }
}
