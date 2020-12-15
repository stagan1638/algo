package Lab_5;

public class BipartiteTask {
    private int[][] matrix;
    private int[] colors;

    public BipartiteTask(int[][] matrix) {
        this.matrix = matrix;
        this.colors = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            this.colors[i] = 0;
        }
    }

    public void DfsMethod(int v, int counter) {
        this.colors[v] = counter;
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[v][i] == 1 && this.colors[i] == 0) {
                counter++;
                DfsMethod(i, counter);
            }
            else if (this.matrix[v][i] == 1 && this.colors[i] % 2 == counter % 2 && v != i){
                break;
            }
        }
    }

    public String IsBilobed(int v){
        DfsMethod(v, 1);
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.colors[i] == 0) {
                DfsMethod(i, 1);
            }
        }
        for(int i = 0; i < this.matrix.length - 1; i++){
            if(this.colors[i] % 2 == this.colors[i + 1] % 2){
                return "This graph isn't bilobed.";
            }
        }
        return "This graph is bilobed.";
    }
}
