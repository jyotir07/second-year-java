//WAP to demonstrate a model of animal kingdom
//Animals are of 2 kinds: mammals and birds
//create bird object and mammal object, display the characteristics
//List of characteristics
//    number of wings
//    number of limbs
//    number of eyes
//demonstrate inheritance OOPs concept by:
//    identifying classes
//    identifying which characteristics belong to which class
//---------------------------------------------------------------
//Output:
//    Mammals:
//    Number of limbs = 4
//    Number of eyes = 2
//
//    Birds:
//    Number of wings = 2
//    Number of eyes = 2

//Author: Jyotiraditya Singh
//SAP ID: 500107065
class Birds {

 int w= 2;


 void disp1(){
  System.out.println("Birds have 2 wings");
 }
}
class Mammals extends Birds{
 int li= 4;
 int be= 2;
 int me= 2;
}

class Animals{
 public static void main(String[] args){
  Birds b =new Birds();
  Mammals m = new Mammals();
  System.out.println("Mammals:");
  System.out.println("Limbs: " + m.li);
  System.out.println("Eyes: " + m.me);
  System.out.println(" ");
  System.out.println("Birds: ");
  System.out.println("Wings: " + m.w);
  System.out.println("Eyes: " + m.be);
 }
}