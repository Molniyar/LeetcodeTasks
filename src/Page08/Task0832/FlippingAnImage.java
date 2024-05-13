package Page08.Task0832;

public class FlippingAnImage {
    public static void main(String[] args) {
        printImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
        System.out.println();
        printImage(new FlippingAnImage().flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));
        System.out.println();
        System.out.println();
        printImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}});
        System.out.println();
        printImage(new FlippingAnImage().flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            for (int j = 0, m = image[i].length-1; j < m; j++, m--){
                int keep = image[i][j];
                image[i][j] = image[i][m];
                image[i][m] = keep;
            }
            for (int j = 0; j < image[i].length; j++){
                image[i][j] = Math.abs(image[i][j]-1);
            }
        }
        return image;
    }
    public static void printImage(int[][] image){
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 1){
                    System.out.print("\u001B[48;5;231m" + "   " + "\u001B[0m");
                }
                else System.out.print("\u001B[48;5;16m" + "   " + "\u001B[0m");
            }
            System.out.println();
        }
    }
}

