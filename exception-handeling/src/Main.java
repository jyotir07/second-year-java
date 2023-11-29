//A program to catch an arithmetic exception
//name: Jyotiraditya Singh
//SAP ID: 500107065

class something{
    public static float myf(int a, int b){
        float i = a/b;
        return i;
        }
        public static void main(String args[]){
        int a = 1;
        int b = 0;

        try{
            float c= myf(a,b);
        }
        catch(ArithmeticException ex){
//            System.out.println("Error");
            System.out.println(ex. getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
        System.out.println("Other code");
        }
        }