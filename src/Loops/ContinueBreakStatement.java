package Loops;

public class ContinueBreakStatement {
    public static void main(String[] args) {

        OUTER:
        for (int number=0; number< 5; number++){

            //if (number==4){
           //     break;
           // }

            if (number>=1 && number<=3){
                continue ;
            }

            for (char ch = 'A'; ch < 'H'; ch++){

                if (number==10){
                    break OUTER; // Word 'OUTER' is only for labeling purpose
                    //break statement will stop the execution for certain condition
                }
                if (ch == 'C' || ch=='D'){
                    continue ;  //continue statement will skip those specific conditions
                }

                System.out.print(number);
                System.out.println(ch);


            }
            System.out.println();
        }
    }
}
