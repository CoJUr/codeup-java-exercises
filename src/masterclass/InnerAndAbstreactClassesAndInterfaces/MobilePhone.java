package masterclass.InnerAndAbstreactClassesAndInterfaces;

public class MobilePhone implements ITelephone{


    private int myNumber;
    private boolean isRinging;

    //mobile phone specific field
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true; // change isOn to true
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        //has to be powered on to dial
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false; //setting to false because answered call
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // check to see if right number and isOn
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ringback tone playing ~~");
        } else {
            isRinging = false;
            System.out.println("Cell phone seems to be off");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging; //see if true or false
    }
}
