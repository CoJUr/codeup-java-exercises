package masterclass.InnerAndAbstreactClassesAndInterfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        // could also have done  DeskPhone timsPhone;
        //^actually wouldnt have worked for mobile phone step reassigning

        timsPhone = new DeskPhone(123456);
        //this way is valid bc used appropriate implemented class DeskPhone

        System.out.println("souting tims desk phone: " + timsPhone);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        System.out.println("souting tims CELL: " + timsPhone);

//        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
