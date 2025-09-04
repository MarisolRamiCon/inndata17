public class Matrices {
    public static void main(String[] args) {
        int[][] numeros= new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                numeros[i][j]=i*j;
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
