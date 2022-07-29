package oopprinciples.encap;

abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public void takePicture() {
        System.out.println("Taking picture...");
    }

    abstract void editPicture();
//    abstract here means other aps have to implement only the editing functionality


    public void savePicture() {
        System.out.println("Saving picture...");
//        this is a concrete method, so it must be implemented in the concrete class
    }

    public void sharePicture() {
        System.out.println("Sharing picture...");
        System.out.println("Share by text, or email? : ");
//        PROBLEM: have to open up superclass sharePicture() everytime we want to share a picture, and
//        have been tasked to add another way of sharing photos. Don't want to keep opening superclass method each time
    }

    public void setShareStrategy(ShareStrategy strategy) {
//        delegate the responsibility of sharing strategy, composing with user selection
        this.shareStrategy = strategy;
    }
}

class BasicCameraApp extends PhoneCameraApp {

    public void editPicture(){
        System.out.println("BasicCameraApp: editing picture");
    }

}

class CameraPlusApp extends PhoneCameraApp {

    public void editPicture() {
        System.out.println("CameraPlusApp: editing AMAZING picture");
    }

}
