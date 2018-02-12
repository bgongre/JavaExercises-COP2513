public class Calculator {

    public static void main(String[] args) {

        //check number of strings passed
        if (args.length != 3) {
            System.out.println("usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        //variables for args[0] and args[2]
        Integer operand1;
        Integer operand2;

        //check that operand1 is an integer
        try{
            operand1 = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }

        //check that operand2 is an integer
        try{
            operand2 = Integer.parseInt(args[2]);
        }catch(NumberFormatException e){
            System.out.println("Wrong Input: " + args[2]);
            System.exit(0);
        }

        //result of the operation
        int result =0;

        //determine the operator
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }

        //display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}


