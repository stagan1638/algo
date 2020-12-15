//5 лабораторная работа
//Стаганович А.Л. 2 гр


package Lab_5;

import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] arr){
        int[][] matr = {
                {0,1,0,0,0},
                {1,0,1,0,0},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {0,0,0,1,0}};

        System.out.println("People task: ");
        ComponentTask matrix = new Lab_5.ComponentTask(matr);
        System.out.println(matrix
                .FindСomponents()
                .stream()
                .map(ArrayList::size)
                .max(Comparator.naturalOrder())
                .orElse(0)
        );

        System.out.println("Is bilobed task:");
        BipartiteTask bipartition = new BipartiteTask(matr);
        System.out.println(bipartition.IsBilobed(0));
    }
}