package in.co.nmsworks.week5.exam;

import java.io.*;
import java.util.List;

public class Question1B {
    public void writeToFile(List<product> productList ){
        for (product product : productList) {
            String path="/home/nms/products/"+product.getCategory()+".csv";
            try (FileWriter fr = new FileWriter(path, true);
                 BufferedWriter br = new BufferedWriter(fr)) {
                 String line= String.valueOf(product.getItemId())+","+product.getTitle()+","+product.getCategory()+","+String.valueOf(product.getItemRating())+","+product.getImage()+","+product.getDescription()+","+product.getPrice();
//                    br.append(String.valueOf(product.getItemId())).append(',');
//                    br.append(product.getTitle()).append(',');
//                    br.append(product.getCategory()).append(',');
//                    br.append(String.valueOf(product.getItemRating())).append(',');
//                    br.append(product.getImage()).append(',');
//                    br.append(product.getDescription()).append(',');
//                    br.append(String.valueOf(product.getPrice())).append(',');
                    br.append(line);
                    br.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("successfully writed into the csv file");
    }

    public static void main( String[] args ){
        Question1 q1=new Question1();
        List<product> productList=q1.readFromDatabase();
        new Question1B().writeToFile(productList);
    }
}
