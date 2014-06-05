package corejava.tddintro;

public class ReducePath {
    public String reducePath(String path) {
        String newPath = "/";
        String[] dirs = path.split("/");
        if (dirs.length > 1) {
            for (int i = 1; i < dirs.length - 1; i++) {
                if (!dirs[i + 1].equals("..") && !dirs[i].equals(".") && !dirs[i].equals("")) {
                    newPath += dirs[i];
                    newPath += "/";
                }
            }
            if (!dirs[dirs.length - 1].equals("..") && !dirs[dirs.length - 1].equals(".")) {
                newPath += dirs[dirs.length - 1];
                return newPath.substring(0, newPath.length());
            }
        }
        if (newPath.equals("/")) {
            return newPath;
        }
        return newPath.substring(0, newPath.length() - 1);
    }
}
