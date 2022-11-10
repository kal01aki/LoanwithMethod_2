import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static float savingAmount;
    static  float loanAmount;
    static float loanPurpose;

    static float carLoanAmount;

    static float houseLoanAmount;


    public static void main(String[] args) {
        int userOption = 1;
        // 6 month min saving
        // no criminal record

        // 25 %-> saving
        // loan amount
        // collateral-> substitute
        // year to return
        // interest 15%
        // account(saving amount) balance

        companyInformation();
        personalInformation();


    }

    static void companyInformation (){
        System.out.println("Well Come to our Microfinance Company.");
        System.out.println("Our Company starts working in Ethiopia from 2020 G.C.");
        System.out.println("Now a day we have more than twenty thousand customers, nationwide.");
    }
    static  void  bankLoan(String customerName){

        if (customerStatusCheck(customerName)) {
            System.out.println("Dear " + customerName + "please insert your saving amount ?");
            savingAmount = input.nextFloat();
            System.out.println("If you need the Loan for Car press 1");
            System.out.println("If you need the loan for house press 2");
            loanPurpose = input.nextInt();
            if (loanPurpose == 1)
                carMinStatus(customerName, savingAmount);
            else if (loanPurpose==2){
                houseMinStatus((customerName));
            }


        } else {
            System.out.println("our bank policy doesn't support a loan with criminal records ");
        }


//            System.out.println("press 1 to continue or press 2 to exit");
//             userOption = input.nextInt();



    }

    static void carMinStatus( String customerName, float savingAmount){

        System.out.println("Dear " + customerName + " your Loan request for Car is on progress");
        System.out.println("Please insert your loan amount?");
        float carLoanAmount = input.nextFloat();
        if ((0.20 * loanAmount) <= savingAmount)
            loanInformation(customerName);
        else {
            System.out.println("please try again, you can take a loan for Car a Maximum amount of" + (savingAmount * 5));

            System.out.println("Dear " + customerName + "  please insert your loan amount in Br again ");

            loanAmount = input.nextFloat();

            carMinStatus(customerName, savingAmount);
        }
        loanInformation(customerName);
    }
    static void houseMinStatus(String customerName){

    }
    static void loanInformation(String customerName){

        System.out.println("Dear " + customerName + " please insert the number of years to return the loan ? ");

        float loanReturnYears = input.nextInt();

        System.out.println("Dear " + customerName + "do you have any collaterals or are you planing to buy an asset an hold it as a collateral ?");

        System.out.println("please press 1 if you have any collaterals ");
        System.out.println("please press 2 if you want to collateralize the asset you want to buy ? ");
        System.out.println("please press 3 if you don't agree with our plans  ");


        int collateralStatus = input.nextInt();
        String loanWithIntrest = "your total loan amount plus the interest rate is " + ((loanAmount) + ((loanAmount * 0.15) * loanReturnYears));
        switch (collateralStatus) {

            case 1, 2:
                System.out.println(loanWithIntrest);
                System.out.println("the interest "+ ((carLoanAmount*0.15)* loanReturnYears));
                break;

            case 3:
                System.out.println("our bank policy doesn't support a loan without collaterals");
                break;
            default:
                System.out.println("error");
        }



    }

    static boolean customerStatusCheck(String customerName){


        System.out.println("Dear " + customerName + "do you have any criminal record ? yes/no ");
        String criminalRecordStatus = input.next();

        System.out.println("Dear " + customerName + " have you been a member for 6 months ? yes/no ");
        String membershipStatus = input.next();


        if (criminalRecordStatus.equalsIgnoreCase("no") && membershipStatus.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

    static void personalInformation(){



        System.out.println("Dear Sr/Madam Welcome to our Micro Finance Institute");

        System.out.println("please insert your name ");
        String customerName = input.next();
        System.out.println("Marital Status ?");
        String maritalStatus = input.next();
        System.out.println("what is your profession ?");
        String profession = input.next();
        System.out.println("what is your monthly Income /");
        float income = input.nextFloat();

        bankLoan(customerName);
    }

//    static void minimumSavingStatus(String customerName, float loanAmount, float savingAmount){
//
//        if ((0.25 * loanAmount) <= savingAmount)
//            loanInformation(customerName);
//        else {
//            System.out.println("please try again, you can tak a loan up to" + (savingAmount * 4));
//
//            System.out.println("Dear " + customerName + "  please insert your loan amount in Br again ");
//
//            loanAmount = input.nextFloat();
//
//            minimumSavingStatus(customerName, loanAmount , savingAmount);
//
//
//        }



}
