package Session08_String3.p08_MirrorEnds;

public class Main {
    public static void main(String[] args) {
        MirrorEnds mirrorEnds=new MirrorEnds();

        System.out.println(mirrorEnds.mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds.mirrorEnds("abca"));
        System.out.println(mirrorEnds.mirrorEnds("aba"));
    }
}
