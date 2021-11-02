package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("blue");
        capsules.addLast("red");
        capsules.addFirst("green");
        System.out.println(capsules.getColoredCapsules());

        capsules.removeFirst();
        System.out.println(capsules.getColoredCapsules());
    }

    private List<String> coloredCapsules = new ArrayList<>();

    public List<String> getColoredCapsules() {
        return coloredCapsules;
    }

    public void addLast(String capsule) {
        coloredCapsules.add(capsule);
    }

    public void addFirst(String capsule) {
        coloredCapsules.add(0, capsule);
    }

    public void removeLast() {
        coloredCapsules.remove(coloredCapsules.size() - 1);
    }

    public void removeFirst() {
        coloredCapsules.remove(0);
    }
}