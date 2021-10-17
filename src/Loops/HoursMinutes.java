package Loops;

public class HoursMinutes {
    public static void main(String[] args) {

        // Create a digital clock that prints hours and minutes

        //>> hours from 0 to 12
        //     >> minutes from 0 to 59

        /*0:0
        0:1
        0:2
        0:3

        .. .

        11:59

         */
        //skip hours >> 5, 6 and 7 in the execution
        // stop the execution for 10 and after 10

        for (int a = 0; a < 2; a++) {

            if (a==0)continue;  //took am away
             LABEL:
            for (int hour = 0; hour < 12; hour++) {
                if (hour>4 && hour < 8){
                    continue; }
                //   if (hour == 10 || hour == 11) {
              //      break;
              //  }

                for (int minutes = 0; minutes < 60; minutes++) {

                    if (hour >= 10)
                    break LABEL;

                    if (a == 0){
                        System.out.println(hour + " : " + minutes + " am");
                    } else {
                        System.out.println(hour + " : " + minutes + " pm");


                    }
                }
            }
        }
    }
}
            // for  (int hour=0; hour<12; hour++){
//for (int minutes = 0; minutes< 60; minutes ++){}