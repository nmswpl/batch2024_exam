package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Category {
    ProductList pl = new ProductList();

    public void writeToFile(){
        try (FileWriter fw = new FileWriter("/home/nms/category.csv");
             BufferedWriter bw = new BufferedWriter(fw)){
            for (Products product : pl.productList) {
                bw.write(String.valueOf(product));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Category c = new Category();
        c.writeToFile();
    }
}
