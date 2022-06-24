package masterclass.CompositionAndEncapsulationPolymorph;

//the native resoluton: the width and height and maximums of the monitor in pixels
public class Resolution {

    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //getters

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
