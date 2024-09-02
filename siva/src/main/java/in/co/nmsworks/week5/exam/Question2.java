package in.co.nmsworks.week5.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.fruitVegitablesFileWriting("/home/nms/FoodgrainsoilMasala.csv","FoodgrainsoilMasala");
        question2.fruitVegitablesFileWriting("/home/nms/ BakerycakesDairy.csv"," BakerycakesDairy");
        question2.fruitVegitablesFileWriting("/home/nms/Beverage.csv","Beverage");
        question2.fruitVegitablesFileWriting("/home/nms/SnacksBrandedFoods.csv","SnacksBrandedFoods");
        question2.fruitVegitablesFileWriting("/home/nms/Cleaninghousehold.csv","Cleaninghousehold");
        question2.fruitVegitablesFileWriting("/home/nms/PersonalCare.csv","PersonalCare");
        question2.fruitVegitablesFileWriting("/home/nms/Electronics.csv","Electronics");

    }
    public void fruitVegitablesFileWriting(String path,String category){
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            Question1 question1 = new Question1();
            for (ProductsDetail productsDetail : question1.getDetailsFromDb()) {
                //System.out.println(productsDetail.getCategory());
                //System.out.println(category);
                if(productsDetail.getCategory().equalsIgnoreCase(category))
                {

                    bw.write("" + productsDetail.getItemId()+","+productsDetail.getTitle()+","+productsDetail.getCategory()+","+productsDetail.getItemRating()+","+productsDetail.getImage()+","+productsDetail.getDescription()+","+productsDetail.getPrice());
                    bw.newLine();
                }




            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
