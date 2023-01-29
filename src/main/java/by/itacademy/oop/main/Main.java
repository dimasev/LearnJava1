package main.java.by.itacademy.oop.main;

import main.java.by.itacademy.oop.comparator.PriceComparator;
import main.java.by.itacademy.oop.createvegetables.CreateVegetables;
import main.java.by.itacademy.oop.createvegetables.impl.CreateVegetablesImpl;
import main.java.by.itacademy.oop.entity.Salad;
import main.java.by.itacademy.oop.entity.Vegetables;
import main.java.by.itacademy.oop.exception.CustomException;
import main.java.by.itacademy.oop.reader.ReaderFile;
import main.java.by.itacademy.oop.reader.impl.ReaderFileImpl;
import main.java.by.itacademy.oop.service.SaladService;
import main.java.by.itacademy.oop.service.impl.SaladServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        Logger logger = LogManager.getLogger();
        ReaderFile readerFile = new ReaderFileImpl();
        CreateVegetables createVegetables = new CreateVegetablesImpl();
        SaladService saladService = new SaladServiceImpl();
        File file = new File("res\\doc.txt");
        if (!readerFile.isFileEmpty(file)){
            List<String> stringVegetable = readerFile.readFile(file);
            List<Vegetables> billet = createVegetables.createBillet(stringVegetable);
            saladService.preparftionOfVegetables(billet);
            Salad salad =  new Salad("Caesar", billet);
            System.out.println(saladService.calculatePriceSalad(billet));
            Collections.sort(billet, new PriceComparator());
            for (Vegetables vb : billet){
                System.out.println(vb.toString());}
            saladService.searchingForVegetablesByCalories(salad, 523);
        }
        else{ throw new CustomException("File is empty");}
    }
}
