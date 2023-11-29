//WAP in java to create interface inherit the interface and override the method in it
//Author: Jyotiraditya Singh
//Date: 19 sept 2023
//SAP ID: 500107065


interface mydisp{
    void disp();
}
class myclass implements mydisp{
    public void disp()
    {
        System.out.println("hello!");
    }
}
class interface_prac{
    public static void main(String[] args)
    {
        myclass m = new myclass();
        m.disp();

    }

}