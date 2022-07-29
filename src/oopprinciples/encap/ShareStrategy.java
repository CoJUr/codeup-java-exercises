package oopprinciples.encap;

public interface ShareStrategy {
    void share();
}

class Txt implements ShareStrategy {
    public void share() {
        System.out.println("Sharing in TXT");
    }
}

class email implements ShareStrategy {
    public void share() {
        System.out.println("Sharing in email");
    }
}

class SocialMedia implements ShareStrategy {
    public void share() {
        System.out.println("Sharing in Social Media");
    }
}
