import java.util.ArrayList;
import java.lang.String;

public class Zipcode{
     //here i will declare and instantiate

     //input variables
     private int zipnum;
     private String bar;
     int i;

     //conversion variables
     private String [] bartrans = {"||:::" , ":::||" , "::|:|", 
                                     "::||:" , ":|::|" , ":|:|:",
                                     ":||::" , "|:::|" , "|::|:",
                                     "|:|::" };
     private int[] weight = {7,4,2,1,0};
     //overloaded constructors for diffrent inputs
     public Zipcode(int zipnum){
          this.zipnum = zipnum;
     }
     public Zipcode(String bar){
          this.bar = bar;
     }
     public String getBarcode(){
          ArrayList<String> result = new ArrayList<String>();
          int valueeach; // store value of each individual
          int sum =0; //digit sum

          //zip code bar format
          i = 0;
          while (i < 5){
              valueeach = zipnum % 10;
              zipnum = zipnum / 10;
              sum = sum + valueeach;
              result.add(0 , bartrans[valueeach]);
              i++;
          }

          result.add(0, "|");//adding bar at the beginignas apart of the rule
          int digitcheck;
          if (sum % 10 ==0){
             digitcheck = 0;  
          } else {
               digitcheck = 10 - (sum % 10);
          }

          //adding digitcheck to the list
          result.add(bartrans[digitcheck]);

          //will add end bar as part of the rule
          result.add("|");

          // return everything in one format
          String output = String.join("", result);
          return output;
     }



     public String getZIPcode(){
          // stores output at the end 
          ArrayList<String> result = new ArrayList<String>();

          // instantiating variables

          int indexcurrent;
          char currChar = ':';
          int digit =0;
          int checkdigit = 0;
          int barcount; //this will check for mismatch 
        
        i = 0;

        while (i < 6) {
            digit = 0;
            barcount = 0;
            int j = 1;
            while (j < 6){
                indexcurrent = 5*i + j;
                if (indexcurrent < bar.length()){
                    currChar = bar.charAt(indexcurrent);
                }
                if(currChar == '|' && indexcurrent != 0){
                    barcount ++;
                    if(barcount < 3){
                        digit = digit + weight[j-1];
                    }
                    else {
                        return "type mismatch";
                    }
                
                } 
                
                j++;
                }
                //  according to the rule 0 = 11

                if (digit == 11){
                    digit = 0;
                }

                // first five strings 
                if (i != 5){
                    result.add(String.valueOf(digit));
                    
                    checkdigit = checkdigit + digit;
                }

            i++;
        


        }

           //possible mismatch and formating 

           if( (checkdigit + digit) % 10  != 0 ||
           bar.charAt(bar.length() - 1)  != '|' ||
           bar.length() != 32 ||
           bar.charAt(0) != '|') {
                return "type mismatch";
           }

           String output = String.join("", result);
           return output;

     }

}