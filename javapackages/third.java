
import third.dept;
import third.Cse.*;
import third.Ece.*;
import third.Me.*;

class third {
    public static void main(String[] args) {
       
        dept dep1=new CSE();
        dep1.firstYearSub();
        dep1.secondYearSub();
        dep1.thirdYearSub();
        dep1.fourthYearSub();

        dept dep2=new ECE();
        dep2.firstYearSub();
        dep2.secondYearSub();
        dep2.thirdYearSub();
        dep2.fourthYearSub();

        dept dep3=new ME();
        dep3.firstYearSub();
        dep3.secondYearSub();
        dep3.thirdYearSub();
        dep3.fourthYearSub();
    }
}