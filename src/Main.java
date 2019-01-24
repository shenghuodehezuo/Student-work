import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args)throws IOException , DocumentException {
//        Properties pop=new Properties();
//        Main.class.getResourceAsStream("resourses/test.properties");
//        pop.load(new FileReader("resources/test.properties"));
//        System.out.println(pop.getProperty("url"));
        //XML读写
        SAXReader reader=new SAXReader();
        Document doc =reader.read(new File("resources/demo.xml"));
        doc.getRootElement();
        Element eml=doc.getRootElement();
        eml.getText();
        List<Element> list=eml.elements("student");
        for (Element em:list){
            System.out.println(em.element("name").getText());
           System.out.println( em.element("age").getText());
        }

    }
}
