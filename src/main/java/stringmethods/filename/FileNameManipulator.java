package stringmethods.filename;

public class FileNameManipulator {
    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("qwertz"));
        System.out.println(fileNameManipulator.findFileExtension("nc.exe"));
        System.out.println(fileNameManipulator.compareFilesByName("io.bin", "io.bin"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("oauth.DLL"));
        System.out.println(fileNameManipulator.replaceStringPart("nc.exe", "exe", "bin"));
    }

    public char findLastCharacter(String str) {
        str = str.trim();
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();
        return fileName.substring(fileName.lastIndexOf('.'));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        //To be honest, this is the first time that I cannot understand what do the teacher want me to do.
        //If there's the extension, then who would want to return *only* the extension to classify the file?
        return true;
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.trim().equals(actualFileName.trim());   //case-sensitive implementation
    }

    public String changeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();
        String extension = fileName.substring(fileName.lastIndexOf('.'));
        return extension.toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }
}